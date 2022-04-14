package problem1678;

public class GoalParserInterpretation {
    public String interpret(String command) {
        /*StringBuilder str = new StringBuilder();
        int len = command.length();
        int i = 0;
        while (i < len) {
            char ch = command.charAt(i);
            if (ch == 'G')
                str.append("G");
            else if (ch == '(' && command.charAt(i + 1) == ')') {
                str.append("o");
                i++;
            } else if (ch == '(' && command.charAt(i + 1) == 'a') {
                str.append("al");
                i = i + 3;
            }
            i++;
        }
        return str.toString();*/
        return command.replace("G","G").replace("()", "o").replace("(al)", "al");
    }
}
