class Solution {
    public void  dfs (int n, int[][] computers, boolean[] flags, int idx){
        flags[idx] = true;
        
        for(int j = 0; j < n; j++){
            if(!flags[j] && computers[idx][j] == 1){
                dfs(n, computers, flags, j);
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] flags = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!flags[i]){
                answer++;
            }
            dfs(n, computers, flags, i);
        }
        
        return answer;
    }
}