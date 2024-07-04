import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int read() throws IOException{
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13) System.in.read();
        return n;
    }

    public static void main(String[] args) throws IOException {        
        int x, y, n = read();
        int count = 0;
        boolean[][] black = new boolean[100][100];
        for(int i = 0; i < n; i++){
            x = read();
            y = read();
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    if(!black[x+j][y+k]){
                        count++;
                        black[x+j][y+k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}