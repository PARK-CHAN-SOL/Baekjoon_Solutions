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
        for(int iter = 0; iter < m; iter++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for(;i < j;){
                int tmp = arr[i-1];
                arr[i-1] = arr[j-1];
                arr[j-1] = tmp;
                i++;
                j--;
            }
        }

        for(int i = 0; i < n; i++){
            bw.write(arr[i] + " ");
        }
        
        bw.close();
    }
}