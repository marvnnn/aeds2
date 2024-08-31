import java.util.Scanner;
import java.util.Stack;

public class Algebra_Recursiva {
    public static String strReplace(String str) {
        int length = str.length();
        String str2 = "";
        for(int i = 1; i < length; i++) {
            char c = str.charAt(i);
            if(c == 'a') {
                str2 += c;
                i += 2;
            }
            else if(c == 'o') {
                str2 += c;
                i += 1;
            }
            else if(c == 'n') {
                str2 += c;
                i += 2;
            }
            else if(c == '(') 
                str2 += c;
            else if(c == ')') 
                str2 += c;
            else if(c == 'A')
                str2 += str.charAt(2);
            else if(c == 'B')
                str2 += str.charAt(4);
            else if(c == 'C') 
                str2 += str.charAt(6);
        }
        return str2;
    }
    public static char searchA(String pilha) {
        char c = '1';
        for(int i = 0; i < pilha.length(); i++) {
            if(pilha.charAt(i) == '0')
               c = '0';
        }
        return c;
    }
    public static char searchO(String pilha) {
        char c = '0';
        for(int i = 0; i < pilha.length(); i++) {
            if(pilha.charAt(i) == '1')
                c = '1'; 
        }
        return c;
    }
    public static char searchN(String pilha) {
        char c = '0';
        for(int i = 0; i < pilha.length(); i++) {
            if(pilha.charAt(i) == '0')
                c = '1';
        }
        return c;
    }

    public static void funcAlgebra(String algebra, int i, Stack<Character> pilha){
        int tam = algebra.length();
        char c;
        if(i < tam) {
            c = algebra.charAt(i);
            if(c != ')') {
                pilha.push(c);
            }
            else {
                String aux = new String();
                while(c != '(') {
                    aux += c;
                    c = pilha.pop();
                }
                
                c = pilha.pop();
                switch(c) {
                    case 'a':
                        pilha.push(searchA(aux));  
                    break;
                    case 'o':
                        pilha.push(searchO(aux));
                    break;
                    case 'n':
                        pilha.push(searchN(aux));
                    break;
                }
            }
            funcAlgebra(algebra, i+1, pilha);
        }
        else if (i == tam){
            System.out.println(pilha.pop());  
            funcAlgebra(algebra, tam+1, pilha);
        }
    }

    public static boolean compStr(String x, String y) {
        boolean resposta = false;
        int tam1 = x.length(), tam2 = y.length();
        if(tam1 == tam2) {
            resposta = true;
            for(int i = 0; i < tam1; i++) {
                char c1 = x.charAt(i), c2 = y.charAt(i);
                if(c1 != c2) {
                    resposta = false;
                    i = tam1;
                }
            }
        }
        return resposta;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String func = scan.nextLine();
        while(!compStr(func, "0")) {
            func = strReplace(func);
            Stack<Character> pilha = new Stack<>();
            funcAlgebra(func, 0, pilha);
            func = scan.nextLine();
        }
        scan.close();
    
    }
}
