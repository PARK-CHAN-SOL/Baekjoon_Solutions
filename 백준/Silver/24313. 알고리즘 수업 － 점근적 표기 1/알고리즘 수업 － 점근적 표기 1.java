import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        boolean isNagative = n == 13;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if(isNagative) return ~n+1;
        return n;
    }
    public static void main(String[] args) throws IOException {
        int a1 = read();
        int a0 = read();
        int c = read();
        int n0 = read();

        if((c < a1) || ((c-a1) * n0 < a0)){
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}