import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readLine () throws Exception {
        while(System.in.read() != 46);
        System.in.read();
        return 0;
    }
    
    static int readBracket () throws Exception {
        int[] brackets = new int[100];
        int ptr = 0;
        int tmp = System.in.read();
        if(tmp == 46) return -1;
        while(tmp != 46){
            
            if(tmp == 40){
                brackets[ptr++] = tmp;
            } else if (tmp == 91){
                brackets[ptr++] = tmp;
                
            } else if (tmp == 41){
                if(ptr == 0) return readLine();
                else if(brackets[ptr-1] == 40) ptr--;
                else return readLine();
            } else if (tmp == 93){
                if(ptr == 0) return readLine();
                else if(brackets[ptr-1] == 91) ptr--;
                else return readLine();
            }

            tmp = System.in.read();
            
        }
        
        tmp = System.in.read();
        
        return ptr==0 ? 1 : 0;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int result = readBracket();
        while(result != -1){
            
            if(result == 1) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
            
            result = readBracket();
        }
        
        System.out.print(sb);
    }
}