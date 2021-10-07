import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        /*String s1 = "abc";
        String s2 = "ab";
        String s3 = "c";

        String s4 = s2 + s3;
        String s5 = new String("abc");

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));*/
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        String name = s.nextLine();

        if(num >=0 && num<=10)
            System.out.println(num*2);
        if(name.length()>=1 && name.length()<=15)
            System.out.println(name);
    }
}
