import java.util.Scanner;
public class Is_Recursivo {
    public static char toLowcase(char x) {
        if(x >= 'A' && x <= 'Z') {
            x = (char)(x + 32);
        }
        return x;
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
    public static int justReal(String x, int i) {
        int resposta = 0;
        int tam = x.length();
        if(i < tam) {
            char c = x.charAt(i);
            if(!((c >= '0' && c <= '9') || c == ',' || c == '.' || c == ' ')) {
                resposta = 1 + justReal(x, tam);
            }
            else {
                resposta = resposta + justReal(x, i + 1);
            }
        }
        return resposta;
    }
    public static int justInt(String x, int i) {
        int resposta = 0;
        int tam = x.length();
        if(i < tam) {
            char c = x.charAt(i);
            if(!(c >= '0' && c <= '9') && c != ' ') {
                resposta = 1 + justInt(x, tam);
            }
            else {
                resposta = resposta + justInt(x, i + 1);
            }
        }
        return resposta;
    }
    public static int justConsoantes(String x, int i) {
        int resposta = 0;
        int tam = x.length();
        if(i < tam) {
            char c = toLowcase(x.charAt(i));
            if((c >= 'a' && c <= 'z') || c == ' ') {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    resposta = 1 + justConsoantes(x, tam);
                }
                else {
                    resposta = resposta + justConsoantes(x, i + 1);
                }
            }
            else {
                resposta = 1 + justConsoantes(x, tam);
            }
        }
        return resposta;
    }

    public static int justVogal(String x, int i){
        int resposta = 0;
        int tam = x.length();
        if(i < tam) {
            char c = toLowcase(x.charAt(i));
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == ' ')) {
                resposta = 1 + justVogal(x, tam);
            }
            else {
                resposta = resposta + justVogal(x, i + 1);
            }
        }
        return resposta;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        while (!eIgual(palavra, "FIM")) {
            int resposta1 = justVogal(palavra, 0);
            int resposta2 = justConsoantes(palavra, 0);
            int resposta3 = justInt(palavra, 0);
            int resposta4 = justReal(palavra, 0);
            if(resposta1 == 0)
                System.out.print("SIM ");
            else 
                System.out.print("NAO ");
            if(resposta2 == 0)
                System.out.print("SIM ");
            else 
                System.out.print("NAO ");
            if(resposta3 == 0)
                System.out.print("SIM ");
            else 
                System.out.print("NAO ");
            if(resposta4 == 0)
                System.out.println("SIM ");
            else 
                System.out.println("NAO ");
            palavra = scan.nextLine();
        }
        scan.close();
    }
}
