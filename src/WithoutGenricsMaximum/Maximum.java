package WithoutGenricsMaximum;

public class Maximum {
    public void maximum(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1 + " is the maximum number.");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2 + " is the maximum number.");
        } else {
            System.out.println(number3 + " is the maximum number.");
        }
    }

    public static void main(String args[]) {
        Maximum Integer = new Maximum();
        // call integer
        Integer.maximum(4, 5, 8);
        System.out.println(Integer);
    }
}

