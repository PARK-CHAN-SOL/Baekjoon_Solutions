import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static String cantorSet (int n) throws Exception {
        if(n == 0) {
            return("-");
        } else {
            StringBuilder sb = new StringBuilder();
            String s = cantorSet(n-1);
            sb.append(s);
            int len = s.length();
            for(int i = 0; i < len; i++){
                sb.append(" ");
            }
            sb.append(s);
            return sb.toString();
        }
    }
    
    public static void main(String[] args) throws Exception  {
        StreamTokenizer st = new StreamTokenizer(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(st.nextToken() != st.TT_EOF){
            int n = (int)st.nval;
            String s = cantorSet(n);
            sb.append(s).append("\n");
        }

        System.out.print(sb);
        
    }
}