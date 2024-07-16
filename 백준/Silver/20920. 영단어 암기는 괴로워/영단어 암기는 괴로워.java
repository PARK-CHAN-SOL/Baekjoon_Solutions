import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] counts;
    static int[] idxs;
    static int[] lengths;
    static int[] tmpc;
    static int[] tmpi;
    static int[] tmpl;
    static int tmp;
    
    static void mergeSort(int startPtr, int endPtr){
        if(startPtr >= endPtr) return;
        int midPtr = (startPtr + endPtr) >> 1;
        mergeSort(startPtr, midPtr);
        mergeSort(midPtr+1, endPtr);
        merge(startPtr, midPtr, endPtr);
    }

    static void merge(int startPtr, int midPtr, int endPtr){
        int tmpPtr = startPtr;
        int leftPtr = startPtr;
        int rightPtr = midPtr+1;
        
        while(leftPtr <= midPtr && rightPtr <= endPtr){
            
            if(counts[leftPtr] < counts[rightPtr]) {
                tmpl[tmpPtr] = lengths[rightPtr];
                tmpi[tmpPtr] = idxs[rightPtr];
                tmpc[tmpPtr++] = counts[rightPtr++];
                
            } else if(counts[leftPtr] == counts[rightPtr]){
                if(lengths[leftPtr] < lengths[rightPtr]){
                    tmpl[tmpPtr] = lengths[rightPtr];
                    tmpi[tmpPtr] = idxs[rightPtr];
                    tmpc[tmpPtr++] = counts[rightPtr++];
                    
                } else {
                    tmpl[tmpPtr] = lengths[leftPtr];
                    tmpi[tmpPtr] = idxs[leftPtr];
                    tmpc[tmpPtr++] = counts[leftPtr++];
                    
                }
                
            } else {
                tmpl[tmpPtr] = lengths[leftPtr];
                tmpi[tmpPtr] = idxs[leftPtr];
                tmpc[tmpPtr++] = counts[leftPtr++];
                
            }
        }

        while(leftPtr <= midPtr){
            tmpl[tmpPtr] = lengths[leftPtr];
            tmpi[tmpPtr] = idxs[leftPtr];
            tmpc[tmpPtr++] = counts[leftPtr++];
        }

        while(rightPtr <= endPtr){
            tmpl[tmpPtr] = lengths[rightPtr];
            tmpi[tmpPtr] = idxs[rightPtr];
            tmpc[tmpPtr++] = counts[rightPtr++];
        }

        for(int i = startPtr; i < tmpPtr; i++){
            lengths[i] = tmpl[i];
            idxs[i] = tmpi[i];
            counts[i] = tmpc[i];
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String[] nm = s.split(" ");
        
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            s = br.readLine();
            if(s.length() >= m) arr.add(s);
        }
        
        Collections.sort(arr);
        int size = arr.size();
        
        counts = new int[size];
        idxs = new int[size];
        lengths = new int[size];
        
        int ptr = 0;
                
        for(int i = 0; i < size-1; i++){
            if(arr.get(i).equals(arr.get(i+1))) counts[ptr]++;
            else{
                lengths[ptr] = arr.get(i).length();
                lengths[ptr+1] = arr.get(i+1).length();
                idxs[ptr] = i;
                idxs[ptr+1] = i+1;
                ptr++;
            }
        }
        
        tmpc = new int[ptr+1];
        tmpi = new int[ptr+1];
        tmpl = new int[ptr+1];

        mergeSort(0, ptr);

        for(int i = 0; i < ptr+1; i++){
            sb.append(arr.get(idxs[i])).append("\n");
        }

        System.out.print(sb);
    }
}