package ds.array.game1d;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class TestCase implements Supplier<TestCase> {
    private Input input;
    private boolean output;

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public boolean getOutput() {
        return output;
    }

    public void setOutput(boolean output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "input=" + getInput() +
                ", output='" + getOutput() + '\'' +
                '}';
    }

    @Override
    public TestCase get() {
        TestCase testCase = new TestCase();
        testCase.input = this.input.get();
        testCase.output = this.output;
        return testCase;
    }
}
