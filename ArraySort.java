import java.util.Random;

public class ArraySort {

    public int[] generationArray(int min, int max, int length) {
        Random r = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = r.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public int[] bubleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}
