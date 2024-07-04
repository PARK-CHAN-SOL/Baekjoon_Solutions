import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int sum = 0;
        
        for(int i =0; i < word.length(); i++){
            switch(word.charAt(i)){
                case'A':
                case'B':
                case'C': sum += 3; break;
                case'D':
                case'E':
                case'F': sum += 4; break;
                case'G':
                case'H':
                case'I': sum += 5; break;
                case'J':
                case'K':
                case'L': sum += 6; break;
                case'M':
                case'N':
                case'O': sum += 7; break;
                case'P':
                case'Q':
                case'R': 
                case'S': sum += 8; break;
                case'T':
                case'U': 
                case'V': sum += 9; break;
                default: sum += 10; break;
            }
        }

        bw.write(sum+"");
        
        bw.close();
        br.close();
    }
}