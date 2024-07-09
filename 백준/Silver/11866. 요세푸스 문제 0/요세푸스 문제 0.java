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
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        int n = readPosInt();
        int k = readPosInt();

        int next = 0;

        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        sb.append("<");
        for(int i = 0 ; i < n-1; i++){
            next = (next + k-1) % (n - i);
            sb.append(list.remove(next)).append(", ");
        }
        sb.append(list.get(0)).append(">");

        System.out.print(sb);
    }
}

		