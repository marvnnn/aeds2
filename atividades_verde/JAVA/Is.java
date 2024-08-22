import java.util.Scanner;
public class Is {
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
    public static boolean justReal(String x) {
        boolean resposta = true;
        int virgula = 0;
        int ponto = 0;
        int tam = x.length();
        for(int i = 0; i < tam; i++) {
            char c = x.charAt(i);
            if(!((c >= '0' && c <= '9') || c == ',' || c == '.')) {
                resposta = false;
                i = tam;
            }
            if(c == ',')
                virgula++;
            if(c == '.')
                ponto++;
            if(virgula > 1 || ponto > 1 || ponto == virgula) {
                resposta = false;
                i = tam;
            }
        }
        return resposta;
    }
    public static boolean justInt(String x) {
        boolean resposta = true;
        int tam = x.length();
        for(int i = 0; i < tam; i++) {
            if(!(x.charAt(i) >= '0' && x.charAt(i) <= '9')) {
                resposta = false;
                i = tam;
            }
        }
        return resposta;
    }
    public static boolean justConsoantes(String x) {
        boolean resposta = true;
        int tam = x.length();
        for(int i = 0; i < tam; i++) {
            char c = toLowcase(x.charAt(i));
            if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') || c >= '0' && c <= '9') {
                resposta = false;
                i = tam;
            }
            if(!(c >= 'a' && c <= 'z')) {
                resposta = false;
                i = tam;
            }
        }
        return resposta;
    }
    public static boolean justVogal(String x){
        boolean resposta = true;
        int tam = x.length();
        for(int i = 0; i < tam; i++) {
            char c = toLowcase(x.charAt(i));
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                resposta = false;
                i = tam;
            }
        }
        return resposta;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        while (!eIgual(palavra, "FIM")) {
            boolean resposta1 = justVogal(palavra);
            boolean resposta2 = justConsoantes(palavra);
            boolean resposta3 = justInt(palavra);
            boolean resposta4 = justReal(palavra);
            if(resposta1)
                System.out.print("SIM ");
            else 
                System.out.print("NAO ");
            if(resposta2)
                System.out.print("SIM ");
            else 
                System.out.print("NAO ");
            if(resposta3)
                System.out.print("SIM ");
            else 
                System.out.print("NAO ");
            if(resposta4)
                System.out.println("SIM ");
            else 
                System.out.println("NAO ");
            palavra = scan.nextLine();
        }
        scan.close();
    }
}
