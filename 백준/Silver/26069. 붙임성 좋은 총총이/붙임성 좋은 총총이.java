import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            String[] sArr = s.split(" ");
            
            if(sArr[0].equals("ChongChong")) hs.add(sArr[0]);
            else if(sArr[1]. equals("ChongChong")) hs.add(sArr[1]);
            
            if(hs.contains(sArr[0])) hs.add(sArr[1]);
            else if(hs.contains(sArr[1])) hs.add(sArr[0]);
        }

        System.out.print(hs.size());
    }
}