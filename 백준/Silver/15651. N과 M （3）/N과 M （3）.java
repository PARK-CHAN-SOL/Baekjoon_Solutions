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

    static void setSeq(int depth) throws Exception {
        if(depth == mm) {
            printArr();
            return;
        }
        for(char i = '1'; i <= n; i++){
            arr[depth] = i;
            setSeq(depth+2);
        }
    }

    static void printArr() throws Exception {
        for(char j = '1'; j <= n; j++){
            arr[mm] = j;
            bw.write(arr);
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
        
        mm = mm - 2;
        
        setSeq(0);
        
        bw.flush();

    }
}