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
        int n = read();
        int count = 1;
        int sss = 666;
        
        while(count != n){
            sss++;
            if(Integer.toString(sss).contains("666")){
                count++;
            }
        }

        System.out.println(sss);
    }
}