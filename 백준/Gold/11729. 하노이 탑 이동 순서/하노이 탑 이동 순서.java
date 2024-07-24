import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static StringBuilder sb = new StringBuilder();

    static void hanoi(int num, int from, int by, int to) {
    	if (num == 1) {
    		sb.append(from).append(" ").append(to).append("\n");
    	}
    	else {
    		hanoi(num - 1, from, to, by);
    		sb.append(from).append(" ").append(to).append("\n");
    		hanoi(num - 1, by, from, to);
    	}
    }

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        int n = readPosInt();
        sb.append((int)Math.pow(2,n)-1).append("\n");
        hanoi(n, 1, 2, 3);
        System.out.print(sb);
    }
}