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
        
        int[] list = new int[n];
        boolean[] flags = new boolean[n];
        
        int next = 0;
        int tmp = 0;
        
        for(int i = 0; i < n; i++){
            list[i] = readInt();
        }

        for(int i = 0; i < n-1; i++){
            flags[next] = true;
            tmp = list[next];
            sb.append(next+1).append(" ");
            
            if(tmp > 0) {
                for(int j = 0; j < tmp; j++){
                    next = (next + 1 + n) % n;
                    while(flags[next]) next = (next + 1) % n;
                }
                
            } else {
                for(int j = tmp; j < 0; j++){
                    next = (next - 1 + n) % n;
                    while(flags[next]) next = (next - 1 + n) % n;
                }
                
            }
            
        }

        sb.append(next+1);
        
        System.out.print(sb);
    }
}

		