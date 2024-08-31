import java.util.Random;
import java.util.Scanner;

public class Alteracao_Aleatoria {
    public static char randomChar(Random gerador) {
        return (char)('a' + (Math.abs(gerador.nextInt() % 26)));
    }
    public static String randomGenerator(String x, Random gerador) {
        char pLetra = randomChar(gerador);
        char sLetra = randomChar(gerador);
        String y = "";
        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == pLetra) {
                y += sLetra;
            }
            else {
                y += x.charAt(i);
            }
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
        Random gerador = new Random();
        gerador.setSeed(4);
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        while (!eIgual(palavra, "FIM")) {
            palavra = randomGenerator(palavra, gerador);
            System.out.println(palavra);
            palavra = scan.nextLine();
        }  
        scan.close();      
    }
}
