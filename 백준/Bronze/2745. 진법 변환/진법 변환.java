import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int tmp = 1;
        int sum = 0;
        int sbLen = sb.length();
        for(int i = sbLen-1; i >= 0; i--){
            if(sb.charAt(i) >= 'A'){
                sum += (sb.charAt(i)-55)*tmp;
            } else {
                sum += (sb.charAt(i)-48)*tmp;
            }
            tmp *= b;
        }
        
        System.out.println(sum);
    }
    
}