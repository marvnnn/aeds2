import java.util.Scanner;
public class Sort {
    public static void swap(int menor, int i, int[] array) {
        int temp = array[i];
        array[i] = array[menor];
        array[menor] = temp;
    }
    public static boolean needSwap(int[] vet, int[] vetAux, int i) {
        boolean x = false;
        if((vet[i] % 2 != 0 && vet[i-1] % 2 == 0 && vetAux[i] == vetAux[i-1]) || 
           (vet[i] % 2 == 0 && vet[i-1] % 2 == 0 && vet[i] < vet[i-1] && vetAux[i] == vetAux[i-1]) ||
           (vet[i] % 2 != 0 && vet[i-1] % 2 != 0 && vet[i] > vet[i-1] && vetAux[i] == vetAux[i-1]))
                x = true;
        return x;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(n + " " + m);
        while(n != 0 && m != 0) {
            int[] vet = new int[n];
            int[] vetAux = new int[n];
            for(int i = 0; i < n; i++) {
                int num = scan.nextInt();
                vet[i] = num;
                vetAux[i] = num % m;
            }
            for(int i = 0; i < (n - 1); i++) {
                int menor = i;
                for (int j = (i + 1); j < n; j++){
                    if (vetAux[menor] > vetAux[j]){
                        menor = j;
                    }
                }
                swap(menor, i, vetAux);
                swap(menor, i, vet);
            }
            for(int j = 0; j < n; j++) {
                for(int i = 1; i < n; i++) {
                    if(needSwap(vet, vetAux, i)) {
                        swap(i-1, i, vet);
                    }
                }
            }
            for(int i = 0; i < n; i++)
                System.out.println(vet[i]);
            n = scan.nextInt();
            m = scan.nextInt();
            System.out.println(n + " " + m);
        }
        scan.close();
    }
}
