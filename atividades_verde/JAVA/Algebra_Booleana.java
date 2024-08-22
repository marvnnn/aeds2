import java.util.Scanner;
public class Algebra_Booleana {
    public static boolean algebra(String x) {
        boolean resposta = false;
        int tam = x.length();
        for(int i = 0; i < tam; i++){
            
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String coisax = scan.nextLine();
        while (eIgual(coisax, "0")) {
            boolean resposta = algebra(coisax);
            System.out.println(resposta);
            coisax = scan.nextLine();
        }
        scan.close();
    }
}
