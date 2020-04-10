package pluralsight.list;

import java.util.ArrayList;
import java.util.List;

public class WebsiteClass {
    private List<String> urlList;

    public WebsiteClass() {
        urlList = new ArrayList<>();
    }

    public void printURLs() {
        urlList.add("https://pluralsight.com/search?q=java");
        urlList.add("https://medium.com/search?q=java");
        urlList.add("https://stackoverflow.com/questions/tagged/java");
        urlList.add("https://stackoverflow.com/search?q=java+list");
        urlList.add("https://reddit.com/r/java");
        urlList.add("https://reddit.com/r/javahelp");

        System.out.println("Links from stackoverflow.com:");
        urlList.sort(String::compareTo);
        List<String> firstTwo = urlList.subList(0, 2);
        //int remaining = urlList.size() - firstTwo.size();
        urlList.forEach(System.out::println);

    }
}
