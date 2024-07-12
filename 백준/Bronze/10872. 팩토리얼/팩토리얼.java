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
        int n = 1;
        int f = readPosInt();
        for(int i = 1; i <= f; i++){
            n *= i;
        }
        System.out.print(n);
    }
}