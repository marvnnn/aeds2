import java.util.Scanner;

public class Sequencia_Espelho {
    public static String espelhar(int comeco, int fim) { // Função espelho
        String y = "";
        for(int i = comeco; i <= fim; i++) {
            y += i;
        }
        for(int i = y.length() - 1; i >= 0; i--) {
            y += y.charAt(i);
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int comeco = scan.nextInt();
            int fim = scan.nextInt();
            String resposta = espelhar(comeco, fim);
            System.out.println(resposta);
        }
        scan.close();
    }
}