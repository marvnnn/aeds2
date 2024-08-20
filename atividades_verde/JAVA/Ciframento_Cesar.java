import java.util.Scanner; // Importar o scanner
public class Ciframento_Cesar {
    public static StringBuilder codificador(StringBuilder x) {
        for(int i = 0; i < x.length(); i++) {
            x.setCharAt(i, (char)((int) x.charAt(i) + 3)); // Mudar os caracteres
        }
        return x;
    }
    public static boolean eIgual(String x, String y) { // Função para verificar se uma string é igual a outra
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
        StringBuilder palavra = new StringBuilder(scan.nextLine());
        while(!eIgual(palavra.toString(), "FIM")) {
            palavra = codificador(palavra);
            System.out.println(palavra);
            palavra = new StringBuilder(scan.nextLine());
        }
        scan.close();
    }
}
