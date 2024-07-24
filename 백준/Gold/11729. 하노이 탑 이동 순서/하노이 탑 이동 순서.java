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
        int n = readPosInt();
        
        int count = (int)Math.pow(2,n)-1;
        
        String s = "1 3\n";
        
        for(int i = 1; i < n; i++){
            String tmp = s.replace('3','4');
            tmp = tmp.replace('2','3');
            tmp = tmp.replace('4','2');
            sb.append(tmp).append("1 3\n");
            tmp = tmp.replace('3','4');
            tmp = tmp.replace('2','3');
            tmp = tmp.replace('1','2');
            tmp = tmp.replace('4','1');
            sb.append(tmp);
            s = sb.toString();
            sb.setLength(0);
        }
        
        sb.append(count).append("\n").append(s);
        System.out.print(sb);
    }
}