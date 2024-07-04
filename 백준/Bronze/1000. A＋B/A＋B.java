public class Main{
    public static void main(String[] args) throws Exception {
        int a = System.in.read() & 15;
        System.in.read();
        int b = System.in.read() & 15;
        System.out.print(a+b);
    }
}