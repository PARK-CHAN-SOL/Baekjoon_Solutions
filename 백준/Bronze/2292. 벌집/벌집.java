import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13) System.in.read();
        return n;
    }
    
    public static void main(String[] args) throws IOException {
        int n = read() - 1;
        double room = Math.ceil((3 + Math.sqrt(9.0 + 12.0 * n)) / 6.0);
        System.out.println((int)room);
    }
}