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
        
        int n = readPosInt();
        
        int[] qArr = new int[n+100000];
        int pointer = 0;

        boolean[] qsArr = new boolean[n];
        for(int i = 0; i < n; i++){
            qsArr[i] = readPosInt() == 0;
        }

        for(int i = 0; i < n; i++){
            if(qsArr[i]) qArr[pointer++] = readPosInt();
            else readPosInt();
        }

        n = readPosInt();
        
        int beforeSize = pointer;
        int afterSize = pointer;
        
        for(int i = 0; i < n; i++){
            qArr[pointer++] = readPosInt();
            if(beforeSize > 0) sb.append(qArr[--beforeSize]).append(" ");
            else sb.append(qArr[afterSize++]).append(" ");
        }
        
        System.out.print(sb);
    }
}

		