public class Bubble {
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void bubbleSort(int[] array) {
        int tam = array.length;
        int iBarrier = tam;
        int jBarrier = tam-1;
        for(int i = 0; i < iBarrier; i++) {
            for(int j = 0; j < jBarrier; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j+1, j);
                    iBarrier = j+1;
                }
            }
            jBarrier = iBarrier - 1;
        }
    }
    public static void printArray(int[] array){
        int tam = array.length;
        for(int i = 0; i < tam; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 4, 5, 6, 3, 9, 11, 7};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }
}