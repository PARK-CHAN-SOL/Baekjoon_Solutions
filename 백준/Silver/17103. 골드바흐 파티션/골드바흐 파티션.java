import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        
        boolean[] primes = new boolean[1000001];
        
        for(int i = 2; i < 500001; i++){
            if(!primes[i]){
                for (int j = i + i; j <= 1000000; j += i) {
                    primes[j] = true;
                }
            }
        }

        int t = readPosInt();
        int n, count;
        for(int i = 0; i < t; i++){
            n = readPosInt();
            count = 0;
            for(int j = 2; j <= (n>>1); j++){
                if(!primes[j]) if(!primes[n-j]) count++;
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
        
    }
    
}