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
        
        int m = readPosInt();
        int n = readPosInt();

        for(int i = m; i <= n; i++){
            if(i == 1){
                i++;
                sb.append(2).append("\n");
                continue;
                    
            }
            if(i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13){
                sb.append(i).append("\n");
                continue;
                
            } else if ((i&1)==0) {
                continue;
                
            } else {
                int sqrtI = (int)Math.sqrt(i);
                for(int j = 3; j <= sqrtI; j+=2){
                    if(i%j == 0) break;
                    if(sqrtI-j < 2) sb.append(i).append("\n");
                    
                }
                
            }
            
        }
            
        System.out.print(sb);
        
    }
}