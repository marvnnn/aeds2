import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    
    public static void lerArquivo() throws IOException {
        RandomAccessFile file = new RandomAccessFile("arquivo.txt", "r");
        long i = file.length();
        i -= 8;
        while(i > 0) {
            i-=8;
            file.seek(i);
            System.out.println(file.readDouble());
        }
        file.close();
    }
    
    public static void escreverArquivo(int n) throws IOException {
        Scanner scan = new Scanner(System.in);
        RandomAccessFile file = new RandomAccessFile("arquivo.txt", "rw");
        for(int i = 0; i < n; i++) {
            double num = scan.nextDouble();
            file.writeDouble(num);
        }
        file.close();
        scan.close();
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        escreverArquivo(n);
        lerArquivo();
        scan.close();
    }

}