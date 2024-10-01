class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] counts = new int[n+2];
        
        //lost -> -1, reserve -> +1
        int lostLen = lost.length;
        int reserveLen = reserve.length;
        
        for(int i = 0; i < lostLen; i++){
            counts[lost[i]]--;
        }
        
        for(int i = 0; i < reserveLen; i++){
            counts[reserve[i]]++;
        }
        
        //왼쪽 끝 부터 왼쪽에 빌려줄 수 있으면 빌려주고, 왼쪽에 못 빌려주면 오른쪽에 빌려줌
        for(int i = 1; i <= n; i++){
            if(counts[i] == 1 && counts[i-1] == -1) {
                counts[i]--;
                counts[i-1]++;
            } else if(counts[i] == 1 && counts[i+1] == -1) {
                counts[i]--;
                counts[i+1]++;
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(counts[i] >= 0) answer++;
        }

        return answer;
    }
}