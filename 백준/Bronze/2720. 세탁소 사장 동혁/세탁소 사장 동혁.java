import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if(c == 13) System.in.read();
        return n;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = read();
        int c, q, d, nk;
        for(int i = 0; i < n; i++){
            c = read();
            q = c/25;
            c %= 25;
            d = c/10;
            c %= 10;
            nk = c/5;
            c %= 5;
            bw.write(q + " " + d + " " + nk + " " + c + "\n");
        }
        bw.close();
    }
    
}