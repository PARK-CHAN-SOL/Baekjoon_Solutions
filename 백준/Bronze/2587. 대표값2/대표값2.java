import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        int sum = 0;
        
        for(int i = 0; i < 5; i++){
            arr[i] = read();
            sum += arr[i];
        }
        
        Arrays.sort(arr);

        sum /= 5;
        sb.append(sum).append("\n").append(arr[2]);

        System.out.print(sb);
    }
}