package WithoutGenricsMaximum;

public class Maximum {
    public static String maximum(String number1, String number2, String number3) {
        String maximum = number1;
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