public class Ciframento {
    private static StringBuilder codificador(StringBuilder x) {
        for(int i = 0; i < x.length(); i++) {
           if((int)x.charAt(i) >= 33 && (int)x.charAt(i) <= 126) 
                x.setCharAt(i, (char)((int)x.charAt(i) + 3));
           else 
                x.setCharAt(i, '�');

        }
        return x;
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
        StringBuilder palavra = new StringBuilder(MyIO.readLine());
        while(!eIgual(palavra.toString(), "FIM")) {
            palavra = codificador(palavra);
            System.out.println(palavra);
            palavra = new StringBuilder(MyIO.readLine());
        }
    }
}
