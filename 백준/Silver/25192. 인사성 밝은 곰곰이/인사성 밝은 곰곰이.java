import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        HashSet<String> hs = new HashSet<>();
        
        br.readLine();
        
        for(int i = 1; i < n; i++){
            String s = br.readLine();
            if(s.equals("ENTER")){
                count += hs.size();
                hs = new HashSet<String>();
            }else{
                hs.add(s); 
            }
        }
        
        count += hs.size();
        System.out.print(count);

    }
}