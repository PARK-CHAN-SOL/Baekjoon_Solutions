import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int h = Integer.parseInt(str);
        str = st.nextToken();
        int m = Integer.parseInt(str);
        
        m -= 45;
        if(m < 0){
            m += 60;
            h--;
            if(h == -1){
                h = 23;
            }
        }
        
        System.out.print(h+" "+m);
    }
}