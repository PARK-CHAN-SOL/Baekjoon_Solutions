import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int gcd (int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        
        int a1 = readPosInt();
        int b1 = readPosInt();
        int a2 = readPosInt();
        int b2 = readPosInt();
        
        int A = a1 * b2 + a2 * b1;
        int B = b1 * b2;
        int GCD = gcd(A, B);
        
        sb.append(A/GCD).append(" ").append(B/GCD);
        System.out.print(sb);
    }
}