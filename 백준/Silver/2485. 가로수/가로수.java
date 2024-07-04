import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static int gcdf (int a, int b) {
        if(b == 0) return a;
        return gcdf(b, a % b);
    }
    
    public static void main(String[] args) throws Exception {
        int n = readPosInt();
        int[] cols = new int[n];
        cols[0] = readPosInt();
        cols[1] = readPosInt();
        cols[2] = readPosInt();

        int gcd = gcdf(cols[1]-cols[0], cols[2]-cols[1]);

        for(int i = 3; i < n; i++){
            cols[i] = readPosInt();
            gcd = gcdf(gcd, cols[i]-cols[i-1]);
        }

        System.out.print((cols[n-1]-cols[0])/gcd + 1 -n);
        
    }
}