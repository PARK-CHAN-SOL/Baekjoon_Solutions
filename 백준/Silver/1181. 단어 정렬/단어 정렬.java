import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        TreeSet<String> ts = new TreeSet<>((word1, word2) -> {
            if(word1.length() == word2.length()) return word1.compareTo(word2);
            else return word1.length() - word2.length();
        });
        
        for(int i = 0; i < n; i++) ts.add(br.readLine());

        for(String s : ts){
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}