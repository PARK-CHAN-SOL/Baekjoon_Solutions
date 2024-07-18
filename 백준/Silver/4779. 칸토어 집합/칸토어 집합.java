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
        
        for(int i = 0; i < 12; i++){
            String cantorSetTmp = cantorSet.toString();
            String spaceTmp = space.toString();
            
            cantorSet.append(spaceTmp).append(cantorSetTmp);
            space.append(space).append(spaceTmp);
        }

        while(st.nextToken() != st.TT_EOF){
            int n = (int)st.nval;
            String tmp = cantorSet.substring(0, (int)Math.pow(3,n));
            sb.append(tmp).append("\n");
        }

        System.out.print(sb);
        
    }
}