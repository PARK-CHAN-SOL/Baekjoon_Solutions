import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static long readPosInt() throws IOException{
        long c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static long stein(long a, long b){
        long axb = a * b;
        int exp = 0;
        
        while(((a|b)&1) == 0){
            exp++;
            a >>= 1;
            b >>= 1;
        }
            
        while(a != 0 && b != 0){
            while((a&1) == 0) a >>= 1;
            while((b&1) == 0) b >>= 1;
            if(a > b) a = a - b;
            else b = b - a;
        }

        if(a > b) return(axb>>exp)/a;
        else return(axb>>exp)/b;
     
    }
    
    public static void main(String[] args) throws IOException{
        System.out.print(stein(readPosInt(),readPosInt()));
    }
}