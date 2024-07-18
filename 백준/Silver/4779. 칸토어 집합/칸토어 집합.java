import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws Exception  {
        StreamTokenizer st = new StreamTokenizer(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringBuilder cantorSet = new StringBuilder();
        StringBuilder space = new StringBuilder();
        
        cantorSet.append("-");
        space.append(" ");
        
        String[] arr = new String[13];
        
        for(int i = 0; i < 13; i++){
            arr[i] = cantorSet.toString();
            String spaceTmp = space.toString();
            
            cantorSet.append(spaceTmp).append(arr[i]);
            space.append(space).append(spaceTmp);
        }

        while(st.nextToken() != st.TT_EOF){
            int n = (int)st.nval;
            sb.append(arr[n]).append("\n");
        }

        System.out.print(sb);
        
    }
}