import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] intArr = new int[n];
        
        for(int i = 0; i < n; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(intArr);
        
        System.out.println(intArr[n-k]);
    }
}