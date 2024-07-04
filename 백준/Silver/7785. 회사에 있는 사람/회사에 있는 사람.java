import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readPosInt() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static String readString() throws IOException {
        int c;
        StringBuilder sb = new StringBuilder();
        while((c = System.in.read()) > 32) sb.appendCodePoint(c);
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        Map<String, String> tm = new TreeMap<String, String>((str1, str2) -> {
            return str2.compareTo(str1);
        });

        int n = readPosInt();

        for(int i = 0; i < n; i++){
            tm.put(readString(), readString());
        }
        
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> mapEntry : tm.entrySet()){
            if(mapEntry.getValue().equals("enter")) sb.append(mapEntry.getKey()).append("\n");
        }

        System.out.print(sb);
    }
    
}