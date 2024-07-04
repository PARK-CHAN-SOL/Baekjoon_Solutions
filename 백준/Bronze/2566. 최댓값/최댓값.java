import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c=System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws IOException {        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        int max = n;
        int colRow = 0;
        for(int i = 0; i < 81; i++){
            n = read();
            if(n > max) {
                max = n;
                colRow = i;
            }
        }
        bw.write(max + "\n");
        bw.write((colRow/9+1) + " " + (colRow%9+1));
        bw.close();
    }
    
}