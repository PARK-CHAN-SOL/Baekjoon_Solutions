import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] bw = {"BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB"};
        String[] wb = {"WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"};
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int count = 65;
        String[] inputTable = new String[m];
        for(int i = 0; i < m; i++){
            inputTable[i] = br.readLine();
        }
        for(int i = 0; i <= m-8; i++){
            for(int j = 0; j <= n-8; j++){
                int countTmpBw = 0;
                int countTmpWb = 0;
                for(int h = 0; h < 8; h++){
                    char[] chArrBw = bw[h].toCharArray();
                    char[] chArrWb = wb[h].toCharArray();
                    char[] chArrInput = inputTable[i+h].toCharArray();
                    for(int w = 0; w < 8; w++){
                        if(chArrBw[w] != chArrInput[j+w]) countTmpBw++;
                        else if(chArrWb[w] != chArrInput[j+w]) countTmpWb++;
                    }
                }
                count = Math.min(count, Math.min(countTmpBw, countTmpWb));
            }
        }
        System.out.println(count);
    }
}