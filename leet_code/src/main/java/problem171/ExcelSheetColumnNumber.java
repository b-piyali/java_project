package problem171;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int position = 0;
        for (char c : columnTitle.toCharArray()) {
            position = position * 26 + (c - 'A') + 1;
        }
        return position;
    }
}
