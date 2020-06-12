package may.week2.day14;

import java.util.HashMap;

public class TrieNode_HashMap {
    char c;
    HashMap<Character, TrieNode_HashMap> children = new HashMap<>();
    boolean isLeaf;

    public TrieNode_HashMap() {}

    public TrieNode_HashMap(char c){
        this.c = c;
    }
}
