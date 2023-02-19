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
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));

    }
}