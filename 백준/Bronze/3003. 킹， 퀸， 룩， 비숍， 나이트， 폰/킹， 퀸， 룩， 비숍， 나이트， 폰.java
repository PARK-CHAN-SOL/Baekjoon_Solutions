import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] chess = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < 6; i++){
            chess[i] -= Integer.parseInt(st.nextToken());
            bw.write(chess[i] + " ");
        }
        
        bw.close();
        br.close();
    }
}