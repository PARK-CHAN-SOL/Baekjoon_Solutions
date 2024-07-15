import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readInt() throws Exception {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if(isNegative) n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if(isNegative) return ~n+1;
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int n = readInt();
        int[] arr = new int[n];
        
        int sum = 0;
        
        int maxCounts = Integer.MIN_VALUE;
        int idx = 0;
        int[] counts = new int[8001];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            arr[i] = readInt();
            counts[arr[i]+4000]++;
            sum += arr[i];
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        
        sb.append(Math.round((double)sum/n)).append("\n");
        
        Arrays.sort(arr);
        sb.append(arr[n/2]).append("\n");

        int count = 0;
        for(int i = min; i <= max; i++){
            if(maxCounts < counts[i+4000]){
                count = 0;
                idx = i;
                maxCounts = counts[i+4000];
            } else if(maxCounts == counts[i+4000] && count < 1){
                count++;
                idx = i;
            }
        }
        sb.append(idx).append("\n");
        
        sb.append(max-min);

        System.out.print(sb);
    }
}