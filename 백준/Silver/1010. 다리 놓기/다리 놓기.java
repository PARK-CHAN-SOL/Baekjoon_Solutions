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
        int t = readPosInt();
        
        for(int i = 0; i < t; i++){
            int n = readPosInt();
            int m = readPosInt();
            
            long bcU = 1;
            long bcL = 1;
            
            if(m - n > (m >> 1)){
                for(int j = m-n+1; j <= m; j++){
                    bcU *= j;
                    bcL *= (m-j+1);
                }
            } else {
                for(int j = n+1; j <= m; j++){
                    bcU *= j;
                    bcL *= (m-j+1);
                }
            }
            
            sb.append(bcU/bcL).append("\n");
        }
        System.out.print(sb);
    }
}