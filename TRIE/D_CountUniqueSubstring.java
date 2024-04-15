/*Count Uniqie Substring
 Given a string of length 'n' ogf lowercase alphabet character, we need to count
 total number of distinct substring of given string.

 String str = "ababa"
 ans = 10;
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
public class D_CountUniqueSubstring{
    static Node root = new Node();
    public static void insert(String suffix){
        Node curr = root;
        for(int i=0; i<suffix.length(); i++){
            int index = suffix.charAt(i) - 'a';

            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }

            if(i == suffix.length() - 1){
                curr.children[index].eow = true;
            }
            curr = curr.children[index];
        }
    }
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count=0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]); 
            }
        }
        return count+1; // 1 for root node
    }
    public static void main(String[] args){
        String str = "ababa";

        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            // System.out.println(suffix);
            insert(suffix);
        }

        System.out.println(countNode(root));
    }    
}