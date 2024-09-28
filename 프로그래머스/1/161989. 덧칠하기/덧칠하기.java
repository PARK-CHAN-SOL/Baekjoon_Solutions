class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        m--;
        section[0] += m;
        
        int len = section.length;
        for (int i = 1; i < len; i++){
            if(section[i] <= section[i-1]) {
                section[i] = section[i-1];
            } else {
                section[i] += m;
                answer++;
            }
        }
            
        return answer;
    }
}