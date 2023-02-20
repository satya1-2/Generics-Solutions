package WithoutGenricsMaximum;

public class Maximum {
    public void maximum(float number1, float number2, float number3) {
        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1 + " is the maximum number.");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2 + " is the maximum number.");
        } else {
            System.out.println(number3 + " is the maximum number.");
        }
    }

    public static void main(String args[]) {
        Maximum Float = new Maximum();
        // call integer
        Float.maximum(4.5f, 5.6f, 8.8f);
        System.out.println(Float);
    }
}

