package GenricsMaximum;

public class Maximum<T extends Comparable<T>> {
    T[] arr;

    Maximum(T[] o) {
        arr = o;
    }

    public T maximum() {
        T value = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i].compareTo(value) > 0)
                value = arr[i];
        return value;
    }
}

class generics {
    public static void main(String args[]) {
        int i;
        Integer numbers[] = {10, 2, 5, 4, 6, 1};
        String str[] = {"apple", "peach", "banana"};
        Float flot[] = {2.2f, 4.5f, 5.6f};
        Maximum<Integer> integer = new Maximum<Integer>(numbers);
        Maximum<String> string = new Maximum<String>(str);
        Maximum<Float> floa = new Maximum<Float>(flot);
        System.out.println("Max value in number: " + integer.maximum());

        System.out.println("Max value in String : " + string.maximum());
        System.out.println("Max value in double: " + floa.maximum());

    }
}


