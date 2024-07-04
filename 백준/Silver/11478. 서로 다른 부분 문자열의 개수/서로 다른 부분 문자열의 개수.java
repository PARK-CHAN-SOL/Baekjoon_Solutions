import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte[] str = System.in.readAllBytes();
        Set<String> hs = new HashSet<String>();
        
        for(int i = 1; i < str.length; i++){
            for(int j = 0; j < str.length-i; j++){
                hs.add(new String(str, j, i));
            }
        }

        System.out.println(hs.size());
        
    }
    
}