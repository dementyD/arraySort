package arraySorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {8, 2, 3, 4, 5, 6, 7, 1, 9, 10};
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (count + i == array.length) {
                break;
            }
            count = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int maxElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxElement;
                } else {
                    count++;
                }
            }


        }
        System.out.println(Arrays.toString(array));
    }
}
