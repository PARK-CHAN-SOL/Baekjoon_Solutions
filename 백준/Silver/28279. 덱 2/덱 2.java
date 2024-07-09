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
        int[] deque = new int[2000001];
        int leftPointer = 1000000;
        int rightPointer = 1000001;
        int n = readPosInt();

        for(int i = 0; i < n; i++){
            switch (readPosInt()) {
                case 1:
                    deque[leftPointer--] = readPosInt();
                    break;
                case 2:
                    deque[rightPointer++] = readPosInt();
                    break;
                case 3:
                    if((rightPointer-leftPointer) > 1) sb.append(deque[++leftPointer]).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 4:
                    if((rightPointer-leftPointer) > 1) sb.append(deque[--rightPointer]).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 5:
                    sb.append(rightPointer-leftPointer-1).append("\n");
                    break;
                case 6:
                    if((rightPointer-leftPointer) > 1) sb.append(0).append("\n");
                    else sb.append(1).append("\n");
                    break;
                case 7:
                    if((rightPointer-leftPointer) > 1) sb.append(deque[leftPointer+1]).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 8:
                    if((rightPointer-leftPointer) > 1) sb.append(deque[rightPointer-1]).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}

		