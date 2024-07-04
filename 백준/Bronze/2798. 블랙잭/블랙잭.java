import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] intArr = new int[n];
        for(int i = 0; i < n; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j <n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(intArr[i] + intArr[j] + intArr[k] > sum && intArr[i] + intArr[j] + intArr[k] <= m) sum = intArr[i] + intArr[j] + intArr[k];
                }
            }
        }
        System.out.println(sum);
    }
}