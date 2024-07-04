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
        int remainings = n;
        int five = remainings / 5;
        remainings %=  5;
        int three = remainings / 3;
        
        while(five != -1){
            if(five * 5 + three * 3 != n){
                five--;
                remainings += 5;
                three = remainings / 3;
            } else {
                break;
            }
        }
        
        if(five == -1) System.out.println("-1");
        else System.out.println(five+three);
    }
}