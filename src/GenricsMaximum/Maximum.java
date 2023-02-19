package GenricsMaximum;

public class Maximum {

    public static <T extends Comparable<T>> T maximum(T number1, T number2, T number3) {
        T maximum = number1;

        if (number2.compareTo(maximum) > 0)
            maximum = number2;

        if (number3.compareTo(maximum) > 0)
            maximum = number3;

        return maximum;
    }

    public static void main(String args[]) {
        System.out.printf("Maximum of %s, %s and %s is %s\n", "apple", "peach", "banana", maximum(
                "apple", "peach", "banana"));//string
    }
}