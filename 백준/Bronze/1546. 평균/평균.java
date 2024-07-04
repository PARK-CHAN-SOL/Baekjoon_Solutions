import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int max = -1;
        double sum = 0;
        int score = 0;
        for(int i = 0; i < n; i++){
            score = Integer.parseInt(st.nextToken()); 
            sum += score;
            if (score > max) max = score;
        }

        sum = sum / max * 100 / n;

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}