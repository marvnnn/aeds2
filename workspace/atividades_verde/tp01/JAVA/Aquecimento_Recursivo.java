import java.util.Scanner;
public class Aquecimento_Recursivo {
    private static int numMaiusc(String x, int i) {
        int contador = 0;
        if(i < x.length()) {
            if(x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
                contador++;
            contador = contador + numMaiusc(x, i+1);
        }
        return contador;
    }

    public static boolean eIgual(String x, String y) {
        boolean resposta = false;
        if(x.length() == y.length()) {
            resposta = true;
            for(int i = 0; i < x.length(); i++) {
                if(x.charAt(i) != y.charAt(i)) {
                    resposta = false;
                    i = x.length();   
                }
            }
        }
        return resposta;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        while (!eIgual(palavra, "FIM")) {
            int resposta = numMaiusc(palavra, 0);
            System.out.println(resposta);
            palavra = scan.nextLine();
        }
        scan.close();
    }
}
