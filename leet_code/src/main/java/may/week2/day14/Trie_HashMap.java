package may.week2.day14;

import java.util.HashMap;
import java.util.Map;

public class Trie_HashMap {
    private final TrieNode_HashMap root;

    /**
     * Initialize your data structure here.
     */
    public Trie_HashMap() {
        root = new TrieNode_HashMap();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(final String word) {
        HashMap<Character, TrieNode_HashMap> children = root.children;
        TrieNode_HashMap t;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                t = new TrieNode_HashMap(c);
                children.put(c, t);
            }
            children = t.children;

            //set leaf node
            if (i == word.length() - 1)
                t.isLeaf = true;
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(final String word) {
        TrieNode_HashMap t = searchNode(word);
        return t != null && t.isLeaf;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(final String prefix) {
        return searchNode(prefix) != null;
    }

    public TrieNode_HashMap searchNode(final String str) {
        Map<Character, TrieNode_HashMap> children = root.children;
        TrieNode_HashMap t = null;
        for (char c : str.toCharArray()) {
            if (children.containsKey(c)) {
                t = children.get(c);
                children = t.children;
            } else {
                return null;
            }
        }

        return t;
    }
}
