import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static boolean[] flags;
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static void setSeq(int depth) throws Exception {
        if(depth == 0) {
            for(int i = 0; i < (m<<1); i++){
                bw.write(arr[i]);
            }
            return;
        }
        for(int i = 1; i <= n; i++){
            if(!flags[i]){
                arr[(m-depth)<<1] = (i|48);
                flags[i] = true;
                setSeq(depth-1);
                flags[i] = false;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        n = readPosInt();
        m = readPosInt();
        
        flags = new boolean[n+1];
        arr = new int[m<<1];
        Arrays.fill(arr, 32);
        arr[(m<<1) - 1] = 10;
        
        setSeq(m);
        
        bw.flush();

    }
}