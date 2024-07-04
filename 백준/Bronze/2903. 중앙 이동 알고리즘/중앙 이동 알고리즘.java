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
        int n = read();
        int dot = 1;
        for(int i = 0; i < n; i++){
           dot *= 2;
        }
        dot = (dot + 1) * (dot + 1);
        System.out.println(dot);
    }
}