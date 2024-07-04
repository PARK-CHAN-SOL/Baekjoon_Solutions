import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = Integer.parseInt(sc.next());
        b = sc.nextInt();
        c = a*(b%10);
        System.out.println(a*(b%10));
        b -= b%10;
        c += a*(b%100);
        System.out.println(a*(b%100)/10);
        b -= b%100;
        c += a*b;
        System.out.println(a*b/100);
        System.out.println(c);
        sc.close();
    }
}