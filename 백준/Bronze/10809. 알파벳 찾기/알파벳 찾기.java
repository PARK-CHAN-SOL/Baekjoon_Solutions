import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        
        for(int ch = 'a'; ch < ('z'+1); ch++){
            bw.write(s.indexOf(ch)+" ");
        }

        bw.close();
        br.close();
    }
}