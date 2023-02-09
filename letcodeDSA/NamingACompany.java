/* You are given an array of strings ideas that represents a list of names to be used in the process of naming a company. The process of naming a company is as follows:
Choose 2 distinct names from ideas, call them ideaA and ideaB.
Swap the first letters of ideaA and ideaB with each other.
If both of the new names are not found in the original ideas, then the name ideaA ideaB (the concatenation of ideaA and ideaB, separated by a space) is a valid company name.
Otherwise, it is not a valid name.
Return the number of distinct valid names for the company.

Example 1:
Input: ideas = ["coffee","donuts","time","toffee"]
Output: 6
Explanation: The following selections are valid:
- ("coffee", "donuts"): The company name created is "doffee conuts".
- ("donuts", "coffee"): The company name created is "conuts doffee".
- ("donuts", "time"): The company name created is "tonuts dime".
- ("donuts", "toffee"): The company name created is "tonuts doffee".
- ("time", "donuts"): The company name created is "dime tonuts".
- ("toffee", "donuts"): The company name created is "doffee tonuts".
Therefore, there are a total of 6 distinct company names.
The following are some examples of invalid selections:
- ("coffee", "time"): The name "toffee" formed after swapping already exists in the original array.
- ("time", "toffee"): Both names are still the same after swapping and exist in the original array.
- ("coffee", "toffee"): Both names formed after swapping already exist in the original array.

Example 2:
Input: ideas = ["lack","back"]
Output: 0
Explanation: There are no valid selections. Therefore, 0 is returned.                            */

import java.util.*;
public class NamingACompany {
	public static long distinctNames(String[] ideas) 
	{
		HashSet<String> sets=new HashSet<>();
		int[][] dp=new int[26][26];
		int n=ideas.length;
		long count=0;

		for(String idea:ideas)
			sets.add(idea);

		for(String idea:ideas)
		{
			for(int j=0;j<26;j++)
			{
				String s=(char)(j+'a')+idea.substring(1);

				if(!sets.contains(s))
					dp[idea.charAt(0)-'a'][j]++;
			}
		}

		for(int i=0;i<26;i++){
			for(int j=0;j<26;j++){
				count+=dp[i][j]*dp[j][i];
            }
        }

		return count;
	}
    public static void main(String[] args){
        String[] idea = {"coffee","donuts","time","toffee"};
        System.out.println(distinctNames(idea));
    }
}