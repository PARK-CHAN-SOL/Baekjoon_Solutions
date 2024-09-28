class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] counts = new boolean[n+1];
        int sqrtN = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrtN; i++){
            if(!counts[i]){
                for (int j = i << 1; j <= n; j+= i){
                    counts[j] = true;
                }
            }
        }
        
        for(int i = 2; i <= n; i++){
            if(!counts[i]) answer++;
        }
        
        return answer;
    }
}