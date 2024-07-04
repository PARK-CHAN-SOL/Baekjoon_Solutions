import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] eye = new int[3];

        eye[0] = sc.nextInt();
        eye[1] = sc.nextInt();
        eye[2] = sc.nextInt();
        if(eye[0] == eye[1] && eye[1] == eye[2]){
            System.out.print(10000+eye[0]*1000);
        }else if(eye[0] == eye[1] || eye[1] == eye[2]){
            System.out.print(1000+eye[1]*100);
        }else if(eye[0] == eye[2]){
            System.out.print(1000+eye[2]*100);
        }else{
            if(eye[0] <= eye[1]){
                eye[0] = eye[1];
            }
            if(eye[0] <= eye[2]){
                eye[0] = eye[2];
            }
            System.out.print(100*eye[0]);
        }
        sc.close();
    }
}