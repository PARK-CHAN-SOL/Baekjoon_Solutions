import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int x = Integer.parseInt(str);
        str = br.readLine();
        int y = Integer.parseInt(str);
        int result;
        if(x > 0){
            if(y > 0){
                result = 1;
            }else {
                result = 4;
            }
        }else {
            if(y > 0){
                result = 2;
            }else {
                result = 3;
            }
        }
        System.out.print(result);
        
    }
}