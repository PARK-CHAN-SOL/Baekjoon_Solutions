import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        while(n >= b){
            if(n%b < 10){
                sb.insert(0, n%b);
            } else {
                sb.insert(0, (char)(n%b+55));
            }
                n /= b;
        }
        if(n%b < 10){
            sb.insert(0, n%b);
        } else {
            sb.insert(0, (char)(n%b+55));
        }
        
        System.out.print(sb);
    }
    
}