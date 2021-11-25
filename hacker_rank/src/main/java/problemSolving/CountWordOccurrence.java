package problemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurrence {
    public static void main(String[] args) {
        String sentence = "To associate myself with an organization that provides a challenging job and an opportunity to provide innovative and diligent work";

        //1
        Map<String, Integer> strCount = new HashMap<>();
        for (String str : sentence.toLowerCase().split(" ")) {
            strCount.merge(str,
                    1,
                    Integer::sum);
        }
        System.out.println(strCount);

        //2
        Map<String, Integer> strCount2 = Arrays.stream(sentence.toLowerCase().split(" "))
                .collect(Collectors.toMap(
                        String::trim,
                        v -> 1,
                        Integer::sum
                ));
        System.out.println(strCount2);
    }
}
