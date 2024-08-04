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
        int a = read();
        int b = read();
        int count = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0 && ++count == b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}