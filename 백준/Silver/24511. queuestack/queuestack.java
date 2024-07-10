import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        String qsStr = br.readLine();
        String emStr = br.readLine();
        String[] qsArr = qsStr.split(" ");
        String[] emArr = emStr.split(" ");

        ArrayList<Integer> qArr = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int qs = Integer.parseInt(qsArr[i]);
            if(qs == 0) qArr.add(Integer.parseInt(emArr[i]));
        }

        n = Integer.parseInt(br.readLine());
        
        int beforeSize = qArr.size();
        int afterSize = beforeSize;
        
        String inputStr = br.readLine();
        String[] input = inputStr.split(" ");
        
        for(int i = 0; i < n; i++){
            qArr.add(Integer.parseInt(input[i]));
            if(beforeSize > 0) sb.append(qArr.get(--beforeSize)).append(" ");
            else sb.append(qArr.get(afterSize++)).append(" ");
        }
        
        System.out.print(sb);
    }
}

		