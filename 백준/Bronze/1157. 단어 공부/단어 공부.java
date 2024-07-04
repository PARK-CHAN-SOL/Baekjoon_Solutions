import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        s = s.toLowerCase();
        int[] alphas = new int[26];
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 97;
            alphas[idx]++;
        }
        int swap = 0;
        for(int i = 0; i < 26; i++){
            if(alphas[swap] < alphas[i]) swap = i;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(alphas[swap] == alphas[i]) count++;
        }

        if(count > 1) {
            bw.write('?');
        } else{
            char ch = (char)(swap+65);
            bw.write(ch);
        }

        bw.close();
        br.close();
    }
}