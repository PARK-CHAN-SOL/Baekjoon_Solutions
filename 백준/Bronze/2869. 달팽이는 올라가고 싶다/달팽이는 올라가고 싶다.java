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
        int v = read();
        int day;
        if ((v - a) % (a - b) > 0){
            day = (v - a) / (a - b) + 2;
        } else {
            day = (v - a) / (a - b) + 1;
        }
        System.out.println(day); 
    }
}