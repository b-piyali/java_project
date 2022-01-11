package online_class.home_work.class1;

public class Main {
    public static void main(String[] args) {
        //int n=7*7*7;

        for(int k=100000000; k<=100000000; k++) {
            int count =0;
            for (int i = 1; i*i <= k; i++) {
                for (int j = 1; j*j <=i; j++) {
                    count++;
                }
            }
            System.out.println(k +" --> "+count);
            //System.out.println(count);
        }
    }
}
