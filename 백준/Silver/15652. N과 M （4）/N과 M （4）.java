import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m, mm;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static char[] arr;
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static void setSeq(char rep, int depth) throws Exception {
        if(depth == mm) {
            bw.write(arr);
            return;
        }
        for(char i = rep; i <= n; i++){
                arr[depth] = i;
                setSeq(i, depth+2);
        }
    }
    
    public static void main(String[] args) throws Exception {
        n = readPosInt()|48;
        m = readPosInt();
        mm = m<<1;
        
        arr = new char[mm];

        for(int i = 1; i < mm; i += 2){
            arr[i] = ' ';
        }
        
        arr[mm - 1] = '\n';
        
        setSeq('1', 0);
        
        bw.flush();

    }
}