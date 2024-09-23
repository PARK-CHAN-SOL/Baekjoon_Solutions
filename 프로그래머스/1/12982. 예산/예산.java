import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int ptr = 0;
        int sum = 0;
        int len = d.length;
        Arrays.sort(d);
        while(sum <= budget){
            if(ptr == len) return ptr;
            sum += d[ptr++];
        }
        return ptr-1;
    }
}