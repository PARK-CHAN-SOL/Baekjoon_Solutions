import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static String[] arr;
    static int[] toPowTwo = new int [2188];
    static String space = " ";
    static StringBuilder spacesb = new StringBuilder();
    static StringBuilder arrsb = new StringBuilder();
    static int n;
    static int[] idxs;
    static int oper = 1;
    
    static void  cantorArr (int limit) {
        if(limit == toPowTwo[n]) return;
            
        for(int i = 0; i < limit; i++){
            arrsb.setLength(0);
            arrsb.append(arr[i]).append(space).append(arr[i]);
            arr[i + limit] = arrsb.toString();
            arrsb.setLength(0);
            arrsb.append(arr[i]).append(arr[i]).append(arr[i]);
            arr[i] = arrsb.toString();
        }
        spacesb.setLength(0);
        spacesb.append(space).append(space).append(space);
        space = spacesb.toString();

        cantorArr(limit<<1);
    }

    static void setIdxs(int k) {
        if(k == n) return;
        int kk = k << 1;
        for(int i = 0; i < k; i++){
            idxs[i+k] = idxs[i]+oper;
            idxs[i+kk] = idxs[i];
        }
        oper <<= 1;
        setIdxs(kk + k);
    }
    
    static int readPosInt () throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    public static void main(String[] args) throws Exception {
        toPowTwo[3] = 2;
        toPowTwo[9] = 4;
        toPowTwo[27] = 8;
        toPowTwo[81] = 16;
        toPowTwo[243] = 32;
        toPowTwo[729] = 64;
        toPowTwo[2187] = 128;
        
        n = readPosInt();
        arr = new String[toPowTwo[n]];
        idxs = new int[n];
        
        arr[0] = "*";
        
        cantorArr(1);
        setIdxs(1);
        
        arrsb.setLength(0);

        for(int i = 0; i < n; i++){
            arrsb.append(arr[idxs[i]]).append("\n");
        }

        System.out.print(arrsb);
    }
}