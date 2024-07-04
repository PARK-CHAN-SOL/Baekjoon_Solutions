import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    public static void main(String[] args) throws IOException {
        int x = read();
        StringBuilder sb = new StringBuilder();
        int n = (int)Math.ceil(-0.5+Math.sqrt(0.25+2.0*x));
        int t = (int)(0.5*n*n + 0.5*n - x);
        if (n % 2 == 0) {
            sb.append(n - t).append("/").append(t + 1);
        } else {
            sb.append(t + 1).append("/").append(n - t);
        }
        System.out.println(sb);
    }
}