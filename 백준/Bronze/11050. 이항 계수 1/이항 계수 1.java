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
        int n = readPosInt();
        int k = readPosInt();
        int bcU = 1;
        int bcL = 1;
        for(int i = n-k+1; i <= n; i++){
            bcU *= i;
            bcL *= (n-i+1);
        }
        System.out.print(bcU/bcL);
    }
}