import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        StringBuffer sb = new StringBuffer();
        sb.append(st.nextToken());
        sb = sb.reverse();
        int a = Integer.parseInt(sb.toString());
        sb.delete(0, sb.length());
        sb.append(st.nextToken());
        sb = sb.reverse();
        int b = Integer.parseInt(sb.toString());

        if(a >= b){
            bw.write(a+"");
        }else{
            bw.write(b+"");
        }
        
        bw.close();
        br.close();
    }
}