import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i < 28; i++){
            int num = Integer.parseInt(br.readLine())-1;
            arr[num] = 0;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) bw.write(arr[i]+"\n");
        }

        bw.flush();

        bw.close();
    }
}