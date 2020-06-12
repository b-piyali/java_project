package may.week2.day14;

public class Trie_Array {
    private final TrieNode_Array root;

    public Trie_Array() {
        root = new TrieNode_Array();
    }

    // Inserts a word into the trie.
    public void insert(final String word) {
        TrieNode_Array p = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.arr[index] == null) {
                TrieNode_Array temp = new TrieNode_Array();
                p.arr[index] = temp;
                p = temp;
            } else {
                p = p.arr[index];
            }
        }
        p.isEnd = true;
    }

    // Returns if the word is in the trie.
    public boolean search(final String word) {
        TrieNode_Array p = searchNode(word);
        if (p == null) {
            return false;
        } else {
            return p.isEnd;
        }
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(final String prefix) {
        TrieNode_Array p = searchNode(prefix);
        return p != null;
    }

    public TrieNode_Array searchNode(final String word) {
        TrieNode_Array p = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.arr[index] != null) {
                p = p.arr[index];
            } else {
                return null;
            }
        }

        if (p == root)
            return null;

        return p;
    }
}
