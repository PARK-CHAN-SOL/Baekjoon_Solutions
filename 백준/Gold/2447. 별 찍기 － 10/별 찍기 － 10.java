import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static char[][] stars;
    static int n;

    static void stars (int k) {
        int kk = (k << 1);
        int limit = kk + k;
        if(k == n) return;       
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < limit; j++){
                if(i >= k &&  i < kk && j >= k && j < kk) stars[i][j] = ' ';
                else if(i >= k && i < kk && j < k) stars[i][j] = stars[i-k][j];
                else if(i >= kk && i < limit && j < k) stars[i][j] = stars[i-kk][j];
                else if(i < k && j >= k && j >= k && j < kk) stars[i][j] = stars[i][j-k];
                else if(i >= kk && i < limit && j >= k && j < kk) stars[i][j] = stars[i-kk][j-k];
                else if(i < k && j >= kk && j >= kk && j < limit) stars[i][j] = stars[i][j-kk];
                else if(i >= k && i < kk && j >= kk && j < limit) stars[i][j] = stars[i-k][j-kk];
                else if(i >= kk && i < limit && j >= kk && j < limit) stars[i][j] = stars[i-kk][j-kk];
            }
        }

        stars(limit);
        
    }

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception  {
        StringBuilder sb = new StringBuilder();
        n = readPosInt();
        stars = new char[n][n];
        
        stars[0][0] ='*';
        
        stars(1);

        for(int i = 0; i < n; i++){
            sb.append(stars[i]).append("\n");
        }
        
        System.out.print(sb);
    }
}