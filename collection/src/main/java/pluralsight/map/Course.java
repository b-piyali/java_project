package pluralsight.map;

public class Course {
    private String topic;

    public Course(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return topic;
    }
}
