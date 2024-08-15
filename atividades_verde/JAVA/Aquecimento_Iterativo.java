import java.util.Scanner;
public class Aquecimento_Iterativo {
    private static int numMaiusc(String x) {
        int contador = 0;
        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) >= 'A' && x.charAt(i) <= 'Z') 
                contador++;
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        while (!palavra.equals("FIM")) {
            int resposta = numMaiusc(palavra);
            System.out.println(resposta);
            palavra = scan.nextLine();
        }
    }
    
}
