import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.parseInt(br.readLine());
        int count = 1;
        
        for(int i = 1; i < 9; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                count = i+1;
            }
        }
        
        bw.write(max + "\n" + count);
        bw.flush();

        bw.close();
    }
}