import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();
        sb.append(br.readLine());
        String a = sb.toString();
        String b = sb.reverse().toString();

        if(a.equals(b)){
            bw.write("1");
        } else {
            bw.write("0");
        }
        
        bw.close();
        br.close();
    }
}