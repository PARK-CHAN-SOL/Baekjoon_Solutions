import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while((s = br.readLine()) != null){
            bw.write(s);
            bw.newLine();
        }
        
        bw.close();
        br.close();
    }
}