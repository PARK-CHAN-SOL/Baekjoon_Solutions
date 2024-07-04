import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        int[] a = new int[t];
        int[] b = new int[t];
        
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < t-1; i++){
            bw.write("Case #" + (i + 1) + ": " + (a[i] + b[i]) + "\n");
        }
        
        bw.write("Case #" + (t) + ": " + (a[t-1] + b[t-1]));
        
        bw.close();
        
    }
}