package online_class.hashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {
    public int isValidSudoku(final List<String> A) {
        Set<String> sudokuVals = new HashSet<>();
        for (int i = 0; i < A.size(); i++) {
            String str = A.get(i);
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch != '.') {
                    String row = "Row" + i + ch;
                    String col = "Col" + j + ch;
                    String b = i / 3 + String.valueOf(j / 3);
                    String box = "Box" + b + ch;
                    if (sudokuVals.contains(row) || sudokuVals.contains(col) || sudokuVals.contains(box)) {
                        return 0;
                    }
                    sudokuVals.add(row);
                    sudokuVals.add(col);
                    sudokuVals.add(box);
                }
            }
        }
        return 1;
    }
}
