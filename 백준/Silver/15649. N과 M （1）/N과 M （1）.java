import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static StringBuilder result = new StringBuilder();
    static char[] arr;
    static boolean[] flags;
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static void setSeq(int depth) {
        if(depth == 0) {
            result.append(arr);
            return;
        }
        for(int i = 0; i < n; i++){
            if(!flags[i]){
                arr[(m-depth)<<1] = (char)(i+49);
                flags[i] = true;
                setSeq(depth-1);
                flags[i] = false;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        n = readPosInt();
        m = readPosInt();
        
        flags = new boolean[n];
        arr = new char[m<<1];
        Arrays.fill(arr, ' ');
        arr[(m<<1) - 1] = '\n';
        
        setSeq(m);
        
        System.out.print(result);

    }
}