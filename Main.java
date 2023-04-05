package arraySorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {11, 3, 12, 7, 12, 4, 6, 7, 9, 13};

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int maxElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxElement;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
