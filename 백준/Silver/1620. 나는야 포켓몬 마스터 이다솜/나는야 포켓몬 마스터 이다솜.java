import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int readPosInt() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = readPosInt();
        int m = readPosInt();
        Map<String, Integer> hm = new HashMap<String, Integer>();
        String[] names = new String[n+1];
        
        for(int i = 1; i <= n; i++){
            names[i] = br.readLine();
            hm.put(names[i], i);
        }
        
        for(int i = 0; i < m; i++){
            String tmp = br.readLine();
            if(tmp.charAt(0) < 65) sb.append(names[Integer.parseInt(tmp)]).append("\n");
            else
                sb.append(hm.get(tmp)).append("\n");
        }

        System.out.print(sb);
    }
    
}