import java.util.Scanner;
public class Aquecimento_Recursivo {
    private static int numMaiuscR(String x, int i) {
        int contador = 0;
        if(i < x.length()) {
            if(x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
                contador++;
            return contador + numMaiuscR(x, i+1);
        }
        return contador;
    }
    public static int numMaiusc(String x) {
        int resposta = numMaiuscR(x, 0);
        return resposta;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        while (!palavra.equals("FIM")) {
            int resposta = numMaiusc(palavra);
            System.out.println(resposta);
            palavra = scan.nextLine();
        }
        scan.close();
    }
}
