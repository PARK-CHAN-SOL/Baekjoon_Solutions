import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < n; i++){
            StringBuffer sb = new StringBuffer();
            sb.append(br.readLine());

            for(int j = 0; j < sb.length()-1; j++){
                if(sb.charAt(j) == sb.charAt(j+1)) sb.deleteCharAt(j--);
            }
            for(int j = 0; j < sb.length()-1; j++){
                if(sb.indexOf(sb.substring(j, j+1),j+1) != -1){
                    count++;
                    break;
                }
            }
        }
        
        bw.write(String.valueOf(n-count));
        bw.close();
        br.close();
    }
}