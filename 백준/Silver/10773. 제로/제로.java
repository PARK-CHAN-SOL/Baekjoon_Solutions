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
        int k = readPosInt();
        int[] n = new int[k+1];
        int pointer = 0;
        
        for(int i = 0; i < k; i++){
            int operator = readPosInt();
            
            if(operator == 0) n[0] -= n[pointer--];
            else {
                n[++pointer] = operator;
                n[0] += n[pointer];
            }
            
        }
        
        System.out.print(n[0]);
        
    }
    
}