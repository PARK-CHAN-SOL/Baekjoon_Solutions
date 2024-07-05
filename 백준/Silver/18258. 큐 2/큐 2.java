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
        int c;
        int[] n = new int[5];
        int i = 0;
        for(; (c = System.in.read()) > 32; i++){
            n[i] = c;
        }
        return n[i-1];
    }
    
    public static void main(String[] args) throws Exception {
        int n = readPosInt();
        Deque<Integer> que = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            
            switch (readWord()) {
                case 104:
                    que.push(readPosInt());
                    break;
                case 112:
                    sb.append(que.isEmpty()?-1:que.removeLast()).append("\n");
                    break;
                case 101:
                    sb.append(que.size()).append("\n");
                    break;
                case 121:
                    sb.append(que.isEmpty()?1:0).append("\n");
                    break;
                case 116:
                    sb.append(que.isEmpty()?-1:que.getLast()).append("\n");
                    break;
                case 107:
                    sb.append(que.isEmpty()?-1:que.getFirst()).append("\n");
                    break;
            }
            
        }

        System.out.print(sb);
    }
}