import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static long factorial (int n) {
        if(n == 0 ) return 1;
        return n * factorial (n-1);
    }
    
    public static void main(String[] args) throws Exception {
        System.out.print(factorial(readPosInt()));
    }
}