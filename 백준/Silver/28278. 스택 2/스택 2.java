import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int n = readPosInt();
        ArrayList<Integer> stack = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            int x = readPosInt();
            
            switch (x) {
                case 1: x = readPosInt();
                        stack.add(x);
                        break;
                case 2: if(stack.size() == 0) sb.append(-1).append("\n");
                        else {
                            sb.append(stack.get(stack.size()-1)).append("\n");
                            stack.remove(stack.size()-1);
                        }
                        break;
                case 3: sb.append(stack.size()).append("\n");
                        break;
                case 4: if(stack.size() == 0) sb.append(1).append("\n");
                        else sb.append(0).append("\n");
                        break;
                case 5: if(stack.size() == 0) sb.append(-1).append("\n");
                        else sb.append(stack.get(stack.size()-1)).append("\n");
                        break;
            }
        }
        
        System.out.print(sb);
        
    }
    
}