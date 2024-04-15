/*Given an inuput string and a dictionary of words, find out if the input string
 can be broken into a space-separated sequence of dictionary words.
 
 words[] = {i, like, sam, samsung, mobile, ice}
 key = "ilikesamsung"

 output: true
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
public class B_Word_Break_Problem{
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
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int index = key.charAt(i) - 'a';

            // Node node = curr.children[index]
            if(curr.children[index] == null){
                return false;
            }
            if(i==key.length()-1 && curr.children[index].eow==false){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
    public static void main(String[] args){
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
    }
}

// 1:11:01