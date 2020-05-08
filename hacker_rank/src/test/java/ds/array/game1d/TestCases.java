package ds.array.game1d;

import java.util.Arrays;
import java.util.List;

public class TestCases {
    private List<TestCase> testCaseList;

    public List<TestCase> getTestCaseList() {
        return testCaseList;
    }

    public void setTestCaseList(List<TestCase> testCaseList) {
        this.testCaseList = testCaseList;
    }

    @Override
    public String toString() {
        return "TestCases{" +
                "testCaseList=" + Arrays.toString(getTestCaseList().toArray()) +
                '}';
    }
}
