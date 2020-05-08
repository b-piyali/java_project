package problemSolving.algorithms.warmup.sockMerchant;// created by: bandypiy
// Date: 10/12/2018

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count =0;
        int pairCount =0;
        int pair =0;
        Map<Integer, Integer> sock = new HashMap<>();
        for(int i=0; i<n; i++){
            count =0;
            if(sock.containsKey(ar[i])){
                count = sock.get(ar[i]) +1;
                sock.put(ar[i],count);
            }else{
                sock.put(ar[i],++count);
            }
        }
        for(Map.Entry<Integer, Integer> entry : sock.entrySet()){
            pair = entry.getValue() >> 1;
            pairCount += pair;
        }
        return pairCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
