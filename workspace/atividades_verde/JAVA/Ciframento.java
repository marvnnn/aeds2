import java.util.Scanner;
public class Ciframento {
    private static String codificador(String x) { // Função para codificar a palavra
        String y = "";
        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) >= 32 && x.charAt(i) <= 127) {
                y += (char)(x.charAt(i) + 3);
            }
            else {
                y += x.charAt(i);
            }
        }   
        return y;
    }

    public static boolean eIgual(String x, String y) { // FUnção para comparar duas strings
        boolean resposta = false;
        int tam1 = x.length(), tam2 = y.length();
        if(tam1 == tam2) {
            resposta = true;
            for(int i = 0; i < tam1; i++) {
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
        while(!eIgual(palavra, "FIM")) { // Enquanto for igual, chama a função para codificar.
            palavra = codificador(palavra);
            System.out.println(palavra);
            palavra = scan.nextLine();
        }
        scan.close();
    }
}
