import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        
        if(isNegative) n = System.in.read() & 15;
        
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        
        if(isNegative) return ~n+1;
        
        return n;
    }
    public static void main(String[] args) throws IOException{
        int n = read();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = read();
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++){
            sb.append(arr[i]).append("\n");
        }
        
        System.out.print(sb);
    }
}