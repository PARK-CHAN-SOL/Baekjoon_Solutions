import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j >= (n-1-i)){
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            if (i != (n-1))
            bw.write("\n");
        }
        
        bw.close();
    }
}