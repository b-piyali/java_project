package ds.array.game1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Input implements Supplier<Input> {
    private int size;
    private int leap;
    private List<Integer> values = new ArrayList<>();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLeap() {
        return leap;
    }

    public void setLeap(int leap) {
        this.leap = leap;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Input{" +
                "size='" + getSize() + '\'' +
                ", leap='" + getLeap() + '\'' +
                ", values=" + Arrays.toString(getValues().toArray()) +
                '}';
    }

    @Override
    public Input get() {
        Input input = new Input();
        input.size = this.size;
        input.leap = this.leap;
        input.values.addAll(values);
        return input;
    }
}
