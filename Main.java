public class Main {


    public static int findMax(int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }


        int max = array[0];


        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }


        return max;
    }


    public static void main(String[] args) {

        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};


        int max = findMax(array);
        System.out.println("The maximum value in the array is: " + max);
    }
}