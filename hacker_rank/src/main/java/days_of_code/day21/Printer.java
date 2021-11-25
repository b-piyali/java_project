package days_of_code.day21;

public class Printer<T> {

    public <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }
}
