/*StartsWith Problem
 Create a function boolean startsWith(String prefix) for a trie.
 Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.

 words[] = {"apple", "app", "mango","man", "woman"}
 
 prefix = "app"             output : true
 prefix = "moon"            output: false     
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
public class C_startsWithProblem{
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }

            if(i == word.length()-1){
                curr.children[index].eow = true;
            }
            curr = curr.children[index];
        }
    }
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int index = prefix.charAt(i) - 'a';

            if(curr.children[index] == null){
                return false;
            }

            curr = curr.children[index];
        }
        return true;
    }
    public static void main(String[] args){
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix));
    }
}