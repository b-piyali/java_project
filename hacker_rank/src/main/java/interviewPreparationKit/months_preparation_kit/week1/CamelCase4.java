package interviewPreparationKit.months_preparation_kit.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class CamelCase4 {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String input = "";
            String outputString = "";
            while (Objects.nonNull(input = in.readLine())) {
                String[] inputList = input.split(";");
                if (inputList[0].equalsIgnoreCase("S")) {
                    outputString = splitString(inputList[2]);
                } else if (inputList[0].equalsIgnoreCase("C")) {
                    outputString = combinedString(inputList[1], inputList[2]);
                }
                System.out.println(outputString);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something is wrong!");
        }
    }

    private static String splitString(String str) {
        StringBuilder outputString = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != 40 && ch != 41) {
                if (ch < 97) {
                    outputString.append(" ");
                    ch += 32;

                }
                outputString.append(ch);
            }
        }
        return outputString.toString().trim();
    }

    private static String combinedString(String type, String str) {
        StringBuilder outputString = new StringBuilder();
        boolean toCapital = type.equalsIgnoreCase("C");
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                toCapital = true;
            } else {
                if (toCapital) {
                    ch -= 32;
                    toCapital = false;
                }
                outputString.append(ch);
            }
        }
        if (type.equalsIgnoreCase("M"))
            outputString.append("()");
        return outputString.toString();
    }
}
