import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static int readInt() throws Exception {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if(isNegative) n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        if(isNegative) return ~n+1;
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> idxList = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        int n = readInt();
        
        int next = 0;

        for(int i = 1; i <= n; i++){
            idxList.add(i);
            list.add(readInt());
        }

        for(int i = 1 ; i < n; i++){
            sb.append(idxList.remove(next)).append(" ");
            int listTmp = list.remove(next);

            if(listTmp > 0){
                next = (next + listTmp -1) % (n-i);
            } else {
                next = (next + listTmp) % (n-i);
                if(next < 0) next = next + (n-i);
            }
            
        }
        sb.append(idxList.get(0));

        System.out.print(sb);
    }
}

		