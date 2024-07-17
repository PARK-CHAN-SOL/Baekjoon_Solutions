import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int[] arr;
    static int[] tmpArr;
    static int count = 0;
    static int k;
    static StringBuilder sb = new StringBuilder();
    
    static void mergeSort(int startPtr, int endPtr) {
        if(startPtr < endPtr && count !=k) {
            int midPtr = (startPtr + endPtr) >> 1;
            mergeSort(startPtr, midPtr);
            mergeSort(midPtr+1, endPtr);
            merge(startPtr, midPtr, endPtr);
        }
    }

    static void merge(int startPtr, int midPtr, int endPtr) {
        if(count != k){
            int leftPtr = startPtr;
            int rightPtr = midPtr+1;
            int tmpPtr = leftPtr;
    
            while(leftPtr <= midPtr && rightPtr <= endPtr){
                if(arr[leftPtr] < arr[rightPtr]) tmpArr[tmpPtr++] = arr[leftPtr++];
                else tmpArr[tmpPtr++] = arr[rightPtr++];
            }
            while(leftPtr <= midPtr) tmpArr[tmpPtr++] = arr[leftPtr++];
            while(rightPtr <= endPtr) tmpArr[tmpPtr++] = arr[rightPtr++];

            for(int i = startPtr; i <= endPtr; i++){
                count++;
                if(count == k) {
                    sb.append(tmpArr[i]);
                    return;
                }
                arr[i] = tmpArr[i];
            }
        }
    }

    static int readPosInt() throws Exception {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
    
    public static void main(String[] args) throws Exception {
        int n = readPosInt();
        k = readPosInt();

        arr = new int[n];
        tmpArr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = readPosInt();
        }

        mergeSort(0, n-1);
        
        if(count < k) sb.append(-1);
        
        System.out.print(sb);
    }
}