import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = (int)Math.ceil((double)(100-progresses[i])/speeds[i]);
        }
        
        int max = arr[0];
        int count = 1;
        int ptr = 0;
                
        for(int i = 1; i < len; i++){
            System.out.println(arr[i]);
            if(max < arr[i]) {
                max = arr[i];
                arr[ptr++] = count;
                count = 0;
            } 
            
            if (i == len-1) {
                arr[ptr++] = count + 1;
            }
            count++;
        }

        return Arrays.copyOfRange(arr, 0, ptr);
    }
}