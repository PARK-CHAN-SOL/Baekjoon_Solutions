import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int n, count=0, sqrtI;
        boolean[] flags = new boolean[246913];
        int[] counts = new int[246913];
        for(int i = 1; i <= 246912; i++){
            if(i==2 || i==3) {
                flags[i] = true;
                count++;
                counts[i] = count;
                continue;
            }
        
            sqrtI = (int)Math.sqrt(i);
            for(int j = 2; j <= sqrtI; j++){
                if(i%j == 0) break;
                if(j == sqrtI) {
                    flags[i] = true;
                    count++;
                }
            }
            counts[i] = count;
        }

        while((n=readPosInt()) != 0){
            sb.append(counts[n+n]-counts[n]).append("\n");
        }
        
        System.out.print(sb);
    }
}