import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        s = s.replaceAll("(c=|c-|dz=|d-|s=|lj|nj|z=)", "1");
        
        bw.write(s.length() + "");
        bw.close();
        br.close();
    }
}