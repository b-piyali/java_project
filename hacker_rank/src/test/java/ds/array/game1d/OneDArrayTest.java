package ds.array.game1d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class OneDArrayTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void canWin() throws IOException {
        TestCases testCases = TestCaseGsonParser.parseJSON("C:\\Piyali\\Project\\java\\hackerrank\\src\\main\\resources\\testcase.json");

        List<TestCase> testCaseList = testCases.getTestCaseList();
        if(testCaseList != null) {
            for (TestCase testCase : testCaseList) {
                Input input = testCase.getInput();
                boolean output = OneDArray.canWin(input.getLeap(), input.getValues().stream().mapToInt(Integer::intValue).toArray());
                Assertions.assertEquals(testCase.getOutput(), output);
            }
        }
    }
}