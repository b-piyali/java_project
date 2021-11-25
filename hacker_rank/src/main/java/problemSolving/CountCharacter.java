package problemSolving;

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "abcaadcbcb";
        //approach 1:
        Map<Character, Integer> charCount = str.chars()
                .boxed()
                .collect(toMap(
                        k -> (char) k.intValue(),
                        v -> 1,         // 1 occurence
                        Integer::sum));
        System.out.println("Char Counts:\n" + charCount);

        //approach 2:
        //Map<Character, Integer>
        charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.merge(c,          // key = char
                    1,             // value to merge
                    Integer::sum);      // counting
        }
        System.out.println("Char Counts:\n" + charCount);

        // Approach 3:
       /* Map<Character, Integer> charCount2 = Arrays.stream(new char[][]{str.toCharArray()})
                .collect(toMap(
                        k-> k,
                        v -> 1,         // 1 occurence
                        Integer::sum));
               // .forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("Char Counts:\n" + charCount);*/
    }



    }
