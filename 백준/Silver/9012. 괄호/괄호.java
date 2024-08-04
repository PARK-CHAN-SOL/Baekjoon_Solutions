import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    static boolean readPS(String ps) throws Exception {
        int count40 = 0, count41 = 0;
        
        for(int i = 0; i < ps.length(); i++){
            if(ps.charAt(i) == '(') count40++;
            else count41++;
            if(count40-count41 < 0) return false;
        }
        
        return count40==count41;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = readPosInt();
        
        for(int i = 0; i < t; i++){
            if(readPS(br.readLine())) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        
        System.out.print(sb);
        
    }
    
}