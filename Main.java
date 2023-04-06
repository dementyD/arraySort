package arraySorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 3, 10, 5, 2, 7, 1, 9, 10};
        boolean flag = false;
        
        for (int i = 0; i < array.length - 1; i++) {
            if (flag) {
                break;
            }
            flag = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int maxElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxElement;
                    flag = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}





