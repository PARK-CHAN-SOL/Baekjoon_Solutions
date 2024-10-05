import java.util.Arrays;
class Solution {
    public long solution(int n, int[] times) {
        int len = times.length;
        long answer = 0L;
        
        Arrays.sort(times);
        
        long left = 0L;
        long right = (long)times[len-1] * n;
        long mid = (left + right) >> 1;
        
        while(left <= right){
            long sum = 0;
            mid = (left + right) >> 1;
            for(int i = 0; i < len; i++){
                sum += mid / times[i];
            }
            if(sum < n) {
                left = mid+1;
            } else {
                right = mid-1;
                answer = mid;
            }
        }
        
        return answer;
    }
}