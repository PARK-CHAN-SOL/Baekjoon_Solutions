import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   
        int s = sc.nextInt();
        int[] a = new int[s];
        int[] b = new int[s];
        for(int i = 0; i < s; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        for(int i = 0; i < s-1; i++){
            System.out.println(a[i] + b[i]);
        }
        System.out.print(a[s-1] + b[s-1]);
        
        sc.close();
    }
}