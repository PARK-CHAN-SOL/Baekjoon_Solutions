import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    public static void main(String[] args) throws IOException {
        int a = read();
        int b = read();
        StringBuilder sb = new StringBuilder();
        while(a!=0 || b!=0){
            if(b % a == 0){
                sb.append("factor\n");
            }else if(a % b ==0){
                sb.append("multiple\n");
            }else{
                sb.append("neither\n");
            }
            a = read();
            b = read();
        }
        System.out.print(sb);
    }
}