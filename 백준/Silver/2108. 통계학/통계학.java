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
        int num;
        
        int sum = 0;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int checker1 = 0;
        
        int idx = 0;
        int checker2 = 0;
        int maxCounts = Integer.MIN_VALUE;
        int[] counts = new int[8001];
        
        for(int i = 0; i < n; i++){
            num = readInt();
            counts[num+4000]++;
            sum += num;
            if(max < num) max = num;
            if(min > num) min = num;
        }
        sb.append(Math.round((double)sum/n)).append("\n");
        
        sum = 0;
        for(int i = min; i <= max; i++){
            sum += counts[i+4000];
            if(checker1 == 0 && sum > (n>>1)) {
                sb.append(i).append("\n");
                checker1 = 1;
            }
            if(maxCounts < counts[i+4000]){
                checker2 = 0;
                idx = i;
                maxCounts = counts[i+4000];
            } else if(maxCounts == counts[i+4000] && checker2 == 0){
                checker2 = 1;
                idx = i;
            }
        }
        sb.append(idx).append("\n");
        sb.append(max-min);

        System.out.print(sb);
    }
}