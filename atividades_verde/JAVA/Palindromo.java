public class Palindromo {
    private static boolean simOuNao(String x) {
        int y = x.length() - 1;
        boolean resposta = true;
        for(int i = 0; i < x.length()/2; i++) {
            if(x.charAt(y) != x.charAt(i)){
                resposta = false;
            }
            y--;
        }
        return resposta;
    }
    public static void printarr() {
        String str = MyIO.readLine(); 
        while (!"FIM".equals(str)){
            boolean resposta = simOuNao(str);
            if(resposta)
                MyIO.println("SIM");
            else
                MyIO.println("NAO");
            str = MyIO.readLine();
        }
    }
    public static void main(String[] args) {
        printarr();
    }
}
