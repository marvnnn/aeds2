public class Bubble {
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void bubbleSort(int[] array) {
        int tam = array.length;
        int iBarrier = tam;
        int jBarrier = tam;
        for(int i = 0; i < iBarrier; i++) {
            boolean newSwap = false;
            for(int j = 0; j < jBarrier-1; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j+1, j);
                    iBarrier = j+1;
                    newSwap = true;
                }
            }
            if(!newSwap) i = iBarrier;
            jBarrier = iBarrier;
        }
    }
    public static void printArray(int[] array){
        int tam = array.length;
        for(int i = 0; i < tam; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 4, 3, 10, 2, 6, 11, 0};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }
}