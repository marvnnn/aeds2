public class Ciframento {
    private static StringBuilder codificador(StringBuilder x) {
        for(int i = 0; i < x.length(); i++) {
            x.setCharAt(i, (char)((int)x.charAt(i) + 3));
        }
        return x;
    }
    public static void main(String[] args) {
        StringBuilder palavra = new StringBuilder(MyIO.readChar());
        while(!palavra.toString().equals("FIM")) {
            palavra = codificador(palavra);
            System.out.println(palavra);
            palavra = new StringBuilder(MyIO.readChar());
        }
    }
}
