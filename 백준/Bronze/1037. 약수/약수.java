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
        int t = readPosInt();
        int max = 0;
        int min = Integer.MAX_VALUE;
        int a = 1;
        for(int i = 0; i < t; i++){
            a = readPosInt();
            if(max < a) max = a;
            if(min > a) min = a;
        }
        if(t == 1) System.out.print(a * a);
        else System.out.print(max * min);
    }
}