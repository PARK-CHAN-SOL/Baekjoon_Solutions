import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if(isNegative) n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if(isNegative) return ~n+1;
        return n;
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = read();
        int[][] points = new int[n][2];

        for(int i = 0; i < n; i++){
            points[i][0] = read();
            points[i][1] = read();
        }

        Arrays.sort(points, (p1, p2)->{
            if(p1[0] == p2[0]) return p1[1] - p2[1];
            else return p1[0] - p2[0];
        });

        for(int i = 0; i < n; i++){
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}