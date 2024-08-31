public class ParOuImpar {

    private static void parOuImpar(int x) {
        if(x % 2 == 0) {
            System.out.println("P");
        }
        else {
            System.out.println("I");
        }
    }
    public static void main(String[] args) {
        int num;
        do {
            num = MyIO.readInt();
            if(num != 0) {
                parOuImpar(num);
            }
        } while(num != 0);
    }
}