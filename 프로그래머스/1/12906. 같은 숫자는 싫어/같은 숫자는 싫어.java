import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int len = arr.length;
        
        int[] list = new int[len];
        int ptr = 0;
        int num = arr[0];
        list[ptr++] = num;
        
        
        for(int i = 1; i < len; i++){
            if(num != arr[i]) {
                list[ptr++] = arr[i];
            }
            num = arr[i];
        }
        
        int[] answer = new int[ptr];
        
        for(int i = 0; i < ptr; i++){
            answer[i] = list[i];
        }

        return answer;
    }
}