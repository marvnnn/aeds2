public class Palindromo_Recursivo {
    public static int isPalindromo(String x, int i, int y) { // Função para determinar se é palindromo recursivamente.
        int resposta = 0;
        int tam = x.length();
        if(i < tam/2) {
            if(x.charAt(i) != x.charAt(y)) {
                resposta = 1;
                isPalindromo(x, y, i);
            } else {
                resposta = resposta + isPalindromo(x, i + 1, y - 1);
            }
        }
        return resposta;
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
        String palavra = MyIO.readLine();
        while(!eIgual(palavra, "FIM")) {
            int resposta = isPalindromo(palavra, 0, palavra.length() - 1);
            if(resposta >= 1) 
                MyIO.println("NAO");
            else 
                MyIO.println("SIM");
            palavra = MyIO.readLine();
        }
    }   
}
