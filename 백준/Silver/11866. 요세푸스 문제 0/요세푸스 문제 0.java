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

        int next, cnt = 0;

        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        sb.append("<");
        for(int i = 0 ; i < n-1; i++){
            cnt += k-1;
            next = cnt % (n - i);
            cnt = next;
            sb.append(list.remove(next)).append(", ");
        }
        next = 0;
        sb.append(list.remove(next)).append(">");

        System.out.print(sb);
    }
}

		