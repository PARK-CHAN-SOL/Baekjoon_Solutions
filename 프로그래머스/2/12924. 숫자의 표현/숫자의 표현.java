class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            double root = (1 - (i << 1) + Math.sqrt(Math.pow(((i << 1) - 1), 2) + (n << 3))) / 2;
            if(root == (int)root) answer++;
        }
        return answer;
    }
}