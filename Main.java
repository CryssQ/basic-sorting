public class Main {

    public static void main(String[] args) {

        ArraySort arr = new ArraySort();
        int[] array = arr.generationArray(1, 10, 5);

        System.out.println("Початковий масив:");
        arr.printArray(array);
        
        System.out.println();
        System.out.println("Buble Sort:");
        arr.bubleSort(array);
        arr.printArray(array);
    }
}
