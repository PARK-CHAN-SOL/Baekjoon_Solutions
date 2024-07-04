import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        if(n == 13) return -1;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if(c == 13) System.in.read();
        return n;
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb =  new StringBuilder();
        StringBuilder sbTmp;
        int a = read();
        int b = a-1;
        while(a >= 0){
            sbTmp =  new StringBuilder();
            sbTmp.append(a).append(" = 1");
            for(int i = 2; i < a; i++){
                if(a % i == 0){
                    b -= i;
                    sbTmp.append(" + " + i);
                }
            }
            if(b != 0) {
                sb.append(a).append(" is NOT perfect.\n");
            } else {
                sb.append(sbTmp).append("\n");
            }
            a = read();
            b = a-1;
        }
        System.out.print(sb);
    }
}