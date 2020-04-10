package _30_day_challenge.week1.day6;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * Note:
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 *
 */

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String sortedString = sortString(s);
            map.computeIfAbsent(sortedString, k -> new ArrayList<>());
            map.get(sortedString).add(s);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    public static String sortString(String str) {
        char[] sortedString = str.toCharArray();
        Arrays.sort(sortedString);
        return new String(sortedString);
    }
}
