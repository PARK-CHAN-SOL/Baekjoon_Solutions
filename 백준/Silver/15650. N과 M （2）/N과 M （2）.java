import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m, mm;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static void setSeq(int rep, int depth) throws Exception {
        if(depth == mm) {
            for(int i = 0; i < mm; i++){
                bw.write(arr[i]);
            }
            return;
        }
        for(int i = rep; i <= n; i++){
                arr[depth] = i;
                setSeq(i+1, depth+2);
        }
    }
    
    public static void main(String[] args) throws Exception {
        n = readPosInt()|48;
        m = readPosInt();
        mm = m<<1;
        
        arr = new int[mm];

        for(int i = 1; i < mm; i += 2){
            arr[i] = 32;
        }
        
        arr[mm - 1] = 10;
        
        setSeq(49, 0);
        
        bw.flush();

    }
}