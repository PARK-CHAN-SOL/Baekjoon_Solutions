import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static int readWord() throws Exception {
        int c, n = System.in.read();
        while((c = System.in.read()) > 32) n = c;
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int n = readPosInt();
        int[] que = new int[n];
        int pushPointer = 0;
        int popPointer = 0;
        
        for(int i = 0; i < n; i++){
            
            switch (readWord()) {
                case 104:
                    que[pushPointer++] = readPosInt();
                    break;
                case 112:
                    if(pushPointer==popPointer)sb.append(-1).append("\n");
                    else sb.append(que[popPointer++]).append("\n");
                    break;
                case 101:
                    sb.append(pushPointer-popPointer).append("\n");
                    break;
                case 121:
                    if(pushPointer==popPointer)sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 116:
                    if(pushPointer==popPointer)sb.append(-1).append("\n");
                    else sb.append(que[popPointer]).append("\n");
                    break;
                case 107:
                    if(pushPointer==popPointer)sb.append(-1).append("\n");
                    else sb.append(que[pushPointer-1]).append("\n");
                    break;
            }
            
        }

        System.out.print(sb);
    }
}