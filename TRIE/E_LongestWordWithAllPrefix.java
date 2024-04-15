/*
 Longest Word with all prefix
 Find the longest string in words such that every prefix of it is also in words.

 words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"}
 
 ans = apple
*/

import java.util.*;
class Node{
    Node[] children;
    boolean eow;

    public Node(){
        children = new Node[26];
        for(int i=0; i<26; i++){
            children[i] = null;
        }
        eow = false;
    }
}
public class E_LongestWordWithAllPrefix{
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }

            if(i == word.length() - 1){
                curr.children[index].eow = true;
            }
            curr = curr.children[index];
        }
    }

    public static String ans = " ";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                    
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);

                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
    public static void main(String[] args){
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        StringBuilder sb = new StringBuilder();

        longestWord(root, sb);

        System.out.println(ans);
    }
}