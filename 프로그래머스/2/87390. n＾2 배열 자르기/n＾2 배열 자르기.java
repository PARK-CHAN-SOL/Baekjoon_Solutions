import java.util.Arrays;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        
        int ptr = 0;
        for(long i = left; i <= right; i++){
            answer[ptr++] = Math.max((int)(i / n + 1), (int)(i % n + 1));
        }

        
        return answer;
    }
}