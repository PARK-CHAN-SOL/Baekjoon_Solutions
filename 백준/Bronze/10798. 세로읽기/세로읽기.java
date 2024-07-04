import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static StringBuffer read() throws IOException {
        StringBuffer sb = new StringBuffer();
        int c;
        while((c = System.in.read()) > 32) sb.append((char)c);
        return sb;
    }
    
    public static void main(String[] args) throws IOException {        
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2;
        
        for(int i = 0; i < 5; i++){
            int k = i;
            sb2 = read();
            sb2.setLength(15);
            for(int j = 0; j < 15; j++){
                sb.insert(k, sb2.charAt(j)); 
                k += i + 1; 
            }
        }
        
        sb2 = new StringBuffer();
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) != 0)
            sb2.append(sb.charAt(i));
        }
        
        System.out.print(sb2.toString());
    }
    
}