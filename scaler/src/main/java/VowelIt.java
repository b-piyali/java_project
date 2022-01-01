public class VowelIt {

    public String stringOfVowels(String str) {
        StringBuilder vowelString = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelString.append(ch);
        }
        return vowelString.toString();
    }
}
