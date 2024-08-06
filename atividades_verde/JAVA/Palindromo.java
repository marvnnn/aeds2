public class Palindromo {
    private static boolean simOuNao(String x) {
        int y = x.length() - 1;
        for(int i = 0; i < x.length()/2; i++) {
            if(x.charAt(y) != x.charAt(i))
                return false;
            y--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        do {
            str = MyIO.readString().trim();
            if(!"FIM".equals(str)) {
                boolean resposta = simOuNao(str);
                if(resposta)
                    MyIO.println("SIM");
                else
                    MyIO.println("NAO");
            }
        } while(!"FIM".equals(str));
    }
}
