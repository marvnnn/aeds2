import java.util.Scanner;

public class Ciframento_Recursivo {
    public static String codificador(String x, int i) {
        int tam = x.length();
        String y = "";
        if(i < tam) {
            if(x.charAt(i) >= 32 && x.charAt(i) <= 127) {
                y += (char)(x.charAt(i) + 3);
            } else {
                y += x.charAt(i);
            }
            y += codificador(x, i+1);
        }
        return y;
    }
    public static boolean eIgual(String x, String y) { // Função para comparar duas strings
        boolean resposta = false;
        int tam1 = x.length(), tam2 = y.length();
        if(tam2 == tam1) {
            resposta = true;
            for(int i = 0; i < tam2; i++) {
                if(x.charAt(i) != y.charAt(i)) {
                    resposta = false;
                    i = tam1;   
                }
            }
        }
        return resposta;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        while(!eIgual(palavra, "FIM")) {
            palavra = codificador(palavra, 0);
            System.out.println(palavra);
            palavra = scan.nextLine();
        }
        scan.close();
    }
}