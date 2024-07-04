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
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = readPosInt();
        int m = readPosInt();

        Set<String> nevH = new HashSet<String>();
        List<String> nevS = new ArrayList<String>();
        
        for(int i = 0; i < n; i++) nevH.add(br.readLine());
        
        for(int i = 0; i < m; i++){
            String name = br.readLine();
            if(nevH.contains(name)) nevS.add(name);
        }

        Collections.sort(nevS);
        
        sb.append(nevS.size()).append("\n");
        for(int i = 0; i < nevS.size(); i++) {
            sb.append(nevS.get(i)).append("\n");
        }

        System.out.print(sb);

    }
    
}