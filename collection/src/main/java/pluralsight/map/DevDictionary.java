package pluralsight.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DevDictionary {

    private Map<String, String> dictionary;

    public DevDictionary() {
        dictionary = new HashMap<>();

        dictionary.put("SEO", "Search engine optimization");
        dictionary.put("SaaS", "Software as a service");
        dictionary.put("UX", "User experience");
    }
    public void print() {
        //dictionary.forEach((key, value) -> System.out.println(key + ": " + dictionary.get(key)));
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            System.out.println(key + ": " + dictionary.get(key));
        }
    }
    public void runApp() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter lookup word or Q to quit");
            String input = scanner.nextLine();
            if (input!= null && input.toUpperCase().equals("Q")) {
                if(!dictionary.containsKey(input))
                    System.out.println("Word doesn't exist, try again or Q to quit");
                System.out.println("Thanks for using Dev Dictionary");
                return;
            } else
                System.out.println("Word doesn't exist, try again or Q to quit");


        }
    }
}

