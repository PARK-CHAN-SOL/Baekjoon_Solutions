import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int readInt() throws IOException {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if(isNegative) n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if(isNegative) return ~n+1;
        return n;
    }
    
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] cards = new int[20_000_001];
        int n = readInt();

        for(int i = 0; i < n; i++){
            cards[readInt()+10_000_000]++;
        }

        int m = readInt();

        for(int i = 0; i < m; i++){
            sb.append(cards[readInt()+10_000_000]).append(" ");
        }
        
        System.out.print(sb);
    }
    
}