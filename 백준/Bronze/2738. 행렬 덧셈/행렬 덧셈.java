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
        int n = read();
        int m = read();
        int[][] a = new int[n][m];
        
        for(int i = 0; i < 2*n; i++){
            for(int j = 0; j < m; j++){
                a[i%n][j] += read();
                if(i >= n) bw.write(a[i%n][j] + " ");
            }
            if(i >= n) bw.write("\n");
        }
        
        bw.close();
    }
}