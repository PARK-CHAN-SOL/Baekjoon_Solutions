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
        
        for(int iter = 0; iter < m; iter++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            for(;i < j; i++){
                arr[i] = k;
            }
        }

        for(int iter = 0; iter < arr.length-1; iter++){
            bw.write(arr[iter] + " ");
        }

        bw.write(arr[n-1]+"");

        bw.flush();

        bw.close();
    }
}