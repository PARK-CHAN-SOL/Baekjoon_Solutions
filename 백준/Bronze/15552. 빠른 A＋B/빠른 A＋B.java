import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int iter = Integer.parseInt(br.readLine());
        int[] a = new int[iter];
        int[] b = new int[iter];
        
        for(int i = 0; i < iter; i++){
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < iter-1; i++){
            bw.write(a[i] + b[i] + "\n");
        }
        
        bw.write(a[iter-1] + b[iter-1] + "");
        
        bw.close();
        
    }
}