import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[42];

        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine()) % 42;
            if(!arr[num]){
                arr[num] = true;
            }
        }

        int cnt = 0;
        
        for(int i = 0; i < 42; i++){
            if(arr[i]) cnt++;
        }
        
        bw.write(cnt+"");
        bw.flush();

        bw.close();
    }
}