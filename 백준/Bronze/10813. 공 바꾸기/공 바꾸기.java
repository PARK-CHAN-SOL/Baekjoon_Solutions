import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken())-1;
            int t2 = Integer.parseInt(st.nextToken())-1;
            int tmp =arr[t1];
            arr[t1] = arr[t2];
            arr[t2] = tmp;       
        }

        for(int i = 0; i < n-1; i++){
            bw.write(arr[i]+" ");
        }
        
        bw.write(arr[n-1]+"");

        bw.flush();

        bw.close();
    }
}