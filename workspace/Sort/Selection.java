public class Selection {
    public static void swap(int[] array, int i, int menor) {
        int tmp = array[i];
        array[i] = array[menor];
        array[menor] = tmp;
    }
    public static void printArray(int[] array) {
        int tam = array.length;
        for(int i = 0; i < tam; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void selectionSort(int[] array) {
        int tam = array.length;
        for(int i = 0, z = tam-1; i < z; i++, z--) {
            int menor = i;
            int maior = i;
            for(int j = (i+1); j <= z; j++) {
                if(array[menor] > array[j]) menor = j;
                if(array[maior] < array[j]) maior = j;
            }
            swap(array, i, menor);
            if(maior == i) maior = menor;
            swap(array, z, maior);
        }
    }
    public static void main(String[] args){
        int[] array = {1, 5, 2, 45, 6, 2, 6, 3, 8, 10, 22, 5, 76};
        printArray(array);
        selectionSort(array);
        printArray(array);
    }
}
