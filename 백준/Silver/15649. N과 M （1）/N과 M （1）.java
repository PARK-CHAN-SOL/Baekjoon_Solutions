import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int n, m;
    static StringBuilder result = new StringBuilder();
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static void setSeq(boolean[] flags, int depth,  char[] arr) {
        for(int i = 0; i < n; i++){
            if(!flags[i]){
                char[] arrTmp = arr.clone();
                arrTmp[(m-depth)<<1] = (char)(i+49);
                boolean[] flagsTmp = flags.clone();
                flagsTmp[i] = true;
                if(depth == 1) result.append(arrTmp);
                else setSeq(flagsTmp, depth-1, arrTmp);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        n = readPosInt();
        m = readPosInt();
        
        boolean[] flags = new boolean[n];
        char[] arr = new char[m<<1];
        Arrays.fill(arr, ' ');
        arr[(m<<1) - 1] = '\n';
        
        setSeq(flags, m, arr);
        
        System.out.print(result);

    }
}