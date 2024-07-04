import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static long readPosLong() throws Exception {
        long c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        long n = readPosLong();
        
        for (int i = 0; i < n; i++) {
            long num = readPosLong();
            
            if(num > 3){
                
                for(long k = num;; k++){
                    boolean flag = false;
                    int sqrtk = (int)Math.sqrt(k);
                                 
                    for(int j = 2; j <= sqrtk; j++){
                        if(k%j == 0) break;
                        if(j==sqrtk) flag = !flag;
                    }
                    
                    if(flag) {
                        sb.append(k).append("\n");
                        break;
                    }
                    
                }
                
            } else {
                if(num < 2) sb.append(2).append("\n");
                else sb.append(num).append("\n");
            }

        }

        System.out.print(sb);
        
    }
}