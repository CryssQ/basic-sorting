public static void main(String[] args) {

    ArraySort arr = new ArraySort();

    int[] array1 = arr.generationArray(1, 10, 5);
    int[] array2 = array1.clone();
    int[] array3 = array1.clone();

    System.out.println("Початковий масив:");
    arr.printArray(array1);

    System.out.println("\nBubble Sort:");
    arr.bubbleSort(array1);
    arr.printArray(array1);

    System.out.println("\nInsertion Sort:");
    arr.insertionSort(array2);
    arr.printArray(array2);

    System.out.println("\nSelection Sort:");
    arr.selectionSort(array3);
    arr.printArray(array3);
}
