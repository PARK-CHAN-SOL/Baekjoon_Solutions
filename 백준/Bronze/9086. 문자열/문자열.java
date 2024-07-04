import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());       
        for(int i = 0; i < t; i++){
            String s = br.readLine();
            bw.write(s.charAt(0));
            bw.write(s.charAt(s.length()-1)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}