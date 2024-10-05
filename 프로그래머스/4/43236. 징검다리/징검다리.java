import java.util.Arrays;
class Solution {
     public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
    
        Arrays.sort(rocks);
        
        int left = 1;
        int right = distance;
         
        //최소 거리를 이분탐색
        while(left <= right){
            int mid = (left + right)/2;
            if(countRocks(rocks, mid, distance) <= n){
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
        
        return answer;
    }
    
    public int countRocks(int[] rocks, int mid, int distance){
        int pre = 0; 
        int end = distance;
        
        int count = 0;
        for(int i = 0; i < rocks.length; i++){
            if(rocks[i] - pre < mid) {
                count++;
                continue;
            }
            pre = rocks[i];
        }
        if(end - pre < mid) count++;

        return count;
    }
}