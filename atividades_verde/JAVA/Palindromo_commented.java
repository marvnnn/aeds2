/*
PS.: para vc quebrar as linhas no vscode caso não saiba é Alt + Z ;D
e espero ajudar!!

v0.2 - edited by Vinicius Cesar (Cesar) - 06/08/2024 - 11:00 PM
*/

public class Palindromo_commented { // editar o nome do arquivo e a Classe
    private static boolean simOuNao(String x) {
        // (Opicional) vc poderia ter acrescentado uma variavel boolean para receber o
        // resultado (boolean result = true)
        int y = x.length() - 1;

        /*
         * para vc evitar de analizar toda a String para procurar se há espaço, se vc
         * parar pra pensar o unico caso que daria problema caso fosse palindromo
         * é quando é impar e o espaço esta exatamente no meio, porque pode acontecer
         * que no for não
         * chegue no meio, fazendo ele confirma que é palindromo mas na realidade não é,
         * por causa do espaço, então para evitar esse caso vc coloca um condicional,
         * mas esse eu vou deixar vc pensar em como fazer!!!
         * 
         * PS.: o local ideal é onde está esse comentario (em cima dele ou em baixo, n importa)
         */

        for (int i = 0; i < x.length() / 2; i++) {
            if (x.charAt(y) != x.charAt(i))
                // result = false
                return false; // result;
            y--;
        }
        return true; // result;
    }

    /*
     * separei a resposta em uma outra função void, ela recebe a string e utiliza a
     * função simOuNao(str)
     * com o resultado e imprime a resposta dentro da função.
     * 
     * não é necessário mas deixa o seu main mais limpo, simplesmente coloquei em
     * uma função void que recebe o resultado da função simOuNao() e faz
     * o condicional onde tem o print
     * 
     */
    public static void main(String[] args) {
        String str; // gosto tbm de iniciar sempre a string com vazio, ou seja str = "";
        /*
         * OUUUU uma curiosidade sobre java, é que String não é um tipo
         * e sim uma Classe, como vc pode ver ela começa com S maiusculo, pois é uma
         * classe, portanto, por ser uma classe ela pode ser atribuida a null (str = null;)
         */
        do { // subistitui o do-while por while e fiz uma jogada para evitar de usar uma
             // condicional dentro da repetição
            str = MyIO.readString().trim();
            /*
             * *****IMPORTANTE***** acredito que o seu erro foi usar a função
             * readString().trim() pq se possui um espaço (prox linha)
             * NÃO é um palindromo e sim duas palavras, então o trim não é utilizavel, e
             * para melhorar a entrada de dados é melhor utilizar a função readLine()
             */
            if (!"FIM".equals(str)) {
                /*
                 * para remover vc coloca fora do while str = MyIO.readLine() para iniciar a
                 * chamada e verificar se a primeira palavra é FIM
                 * caso for ele não executa a função toda, e como eu separei a resposta eu
                 * coloquei assim: verify(str) (função onde imprime na tela o resultado) e logo
                 * depois eu coloquei str = MyIO.readLine() para receber a proximo texto e ai
                 * sim verificar novamente se for FIM e caso for ele não vai testar
                 * agora não é preciso verificar toda vez que a repetição acontecer (duas vezes,
                 * pq vc tem o if e o while) ja reduz bastante o custo do seu codigo)
                 */
                boolean resposta = simOuNao(str);
                if (resposta)
                    MyIO.println("SIM");
                else
                    MyIO.println("NAO");
            }
        } while (!"FIM".equals(str));
    }

    /*
     * 
     * Conclusões Gerais: vc estruturou certinho como se faz o palindromo, a sua
     * logica tá totalmente certa, so alguns detalhes de otimização e escolha de
     * função do MyIO
     * o unico problema na logica q vc teve é ignorar o espaço em branco, palindromo
     * é em uma palavra só, com o espaço ele ja não é mais palindromo.
     * 
     */
}