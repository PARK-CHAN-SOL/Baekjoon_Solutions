import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   
        int total = sc.nextInt();
        int num = sc.nextInt();
        int[] product = new int[num];
        int[] productNum = new int[num];
        
        for(int i = 0; i < num; i++){
            product[i] = sc.nextInt();
            productNum[i] = sc.nextInt();
            total = total - product[i] * productNum[i];
        }
        
        if(total == 0){
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
        
        sc.close();
    }
}