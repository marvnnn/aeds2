public class Palindromo_Recursivo {
    public static int isPalindromo(String x, int i, int y) {
        int resposta = 0;
        if(i < x.length()/2) {
            if(x.charAt(i) != x.charAt(y)) {
                resposta = 1;
                isPalindromo(x, y, i);
            }
            resposta = resposta + isPalindromo(x, i + 1, y - 1);
        }
        return resposta;
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
