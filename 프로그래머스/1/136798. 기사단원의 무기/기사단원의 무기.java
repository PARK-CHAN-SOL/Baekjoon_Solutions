class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int count = 2;
            int sqrtI = (int)Math.sqrt(i);
            if(Math.sqrt(i) == sqrtI) count--;
            
            for(int j = 2; j <= sqrtI; j++){
                if(i % j == 0) {
                    count+=2;
                }
            }
            
            if(count > limit) answer += power;
            else answer += count;
        }
        
        return answer;
    }
}