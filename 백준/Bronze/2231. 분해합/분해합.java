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
        int c = (int)Math.log10(n)+1;
        for(int i = n-c*9; i < n; i++){
            int sum = 0;
            int tmp = i;
            for(int j = 0; j < c; j++){
                sum += tmp % 10;
                tmp /= 10;
            }
            if(i+sum == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}