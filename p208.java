package first;
public class p208 {

}
class Trie {
	TrieNode root;
	int size;
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word.length()==0) return;
        TrieNode index=root;
        for(int i=0;i<word.length();i++)
        {
        	if(index.childern[word.charAt(i)-'a']==null)
        	{
        		index.childern[word.charAt(i)-'a']=new TrieNode(word.charAt(i));
        		index=index.childern[word.charAt(i)-'a'];
        	}
        	else index=index.childern[word.charAt(i)-'a'];
        }
        index.isAWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node=root;
        int i=0;
        for(i=0;i<word.length();i++)
        {
        	if(node.childern[word.charAt(i)-'a']==null)
        	break;
        	node=node.childern[word.charAt(i)-'a'];
        }
        if(i!=word.length()) return false;
        else if(node.isAWord) return true;
        else return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	TrieNode node=root;
        int i=0;
        for(i=0;i<prefix.length();i++)
        {
        	if(node.childern[prefix.charAt(i)-'a']==null)
        	break;
        	node=node.childern[prefix.charAt(i)-'a'];
        }
        if(i!=prefix.length()) return false;
        else return true;
    }
}
class TrieNode
{
	TrieNode[] childern=new TrieNode[26];
	boolean isAWord;
	char character;
	public TrieNode()
	{
		character=' ';
		isAWord=false;
	}
	public TrieNode(char val)
	{
		character=val;
		isAWord=false;
	}
}