package algorithm.No_0208_Implement_Trie_Prefix_Tree;



class TrieNode{
    TrieNode[] children;
    String wordString;
    boolean wordFlag;
    public TrieNode(){
        this.children = new TrieNode[26];
    }
}


class Trie {
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    // Time Complexity: O(n), n is the length of the word
    public void insert(String word) {
        TrieNode curr = root;
        for(char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null){
                TrieNode node = new TrieNode();
                node.wordString = curr.wordString + x;
                curr.children[x - 'a'] = node;
            }
            curr = curr.children[x - 'a'];
        }
        curr.wordFlag = true;
    }
    
    /** Returns if the word is in the trie. */
    // Time Complexity: O(n), n is the length of the word
    public boolean search(String word) {
        TrieNode curr = root;
        for(char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null){
                return false;
            }
            curr = curr.children[x - 'a'];
        }
        return curr.wordFlag;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    // Time Complexity: O(n), n is the length of the word
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char x : prefix.toCharArray()){
            if(curr.children[x - 'a'] == null){
                return false;
            }
            curr = curr.children[x - 'a'];
        }
        // when you go down this far there must be a word down there somehow
        return true;
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

public class MainClass {

}
