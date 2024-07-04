import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int readPosInt() throws IOException{
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
        
    }

    static int gcd (int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) throws IOException{
        int a, b, t = readPosInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < t; i++) {
            a = readPosInt();
            b = readPosInt();
            sb.append(a * b / gcd(a,b)).append("\n");
        }
        
        System.out.print(sb);
        
    }
}