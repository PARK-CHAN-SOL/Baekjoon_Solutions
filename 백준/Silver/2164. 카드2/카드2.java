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

        int num = 1;

        while(num < n) num <<= 1;

        System.out.print(num - (num-n)*2);
        
    }
}