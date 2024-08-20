import java.util.Scanner;
public class Palindromo {
    private static boolean simOuNao(String x) { //Função para determinar se é palindromo
        int y = x.length() - 1;
        int tam = x.length();
        boolean resposta = true;
        for(int i = 0; i < tam/2; i++) {
            if(x.charAt(i) != x.charAt(y)){
                resposta = false;
                i = y;
            }
            y--;
        }
        return resposta;
    }
    public static boolean eIgual(String x, String y) { // Função para comparar duas strings
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
    public static void printarr() { // Função para printar as respostas e testar se as strings são iguais.
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); 
        boolean resposta;
        while (!eIgual(str, "FIM")){
            resposta = simOuNao(str);
            if(resposta)
                System.out.println("SIM");
            else
                System.out.println("NAO");
            str = scan.nextLine();
        }
        scan.close();
    }
    public static void main(String[] args) {
        printarr();
    }
}
