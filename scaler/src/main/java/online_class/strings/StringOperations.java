package online_class.strings;

public class StringOperations {
    public String solve(String A) {
        StringBuilder str = new StringBuilder();
        for(char ch : A.toCharArray()){
            if(ch >= 'a' && ch <= 'z') {
                if (ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    str.append('#');
                }else{
                    str.append(ch);
                }
            }
        }
        return str.append(str).toString();
    }
}
