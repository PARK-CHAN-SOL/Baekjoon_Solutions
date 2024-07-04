import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int max = -1000001;
        int min = 1000001;
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }

        bw.write(min + " " + max);
        bw.flush();

        bw.close();
    }
}