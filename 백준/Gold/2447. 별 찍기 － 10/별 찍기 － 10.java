import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static boolean[][] stars;
    static int n;
    
    static void stars (int k) {
        if (k == n) return;
        int limit = (k << 1) + k;
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < limit; j++){
                if(i/k == 1 && j/k == 1) continue;
                stars[i][j] = stars[i%k][j%k];
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
        stars = new boolean[n][n];
        
        stars[0][0] = true;
        
        stars(1);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(stars[i][j]) sb.append("*");
                else sb.append(" ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}