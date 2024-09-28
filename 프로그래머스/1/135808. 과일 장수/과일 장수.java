import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        Arrays.sort(score);
        
        for(int i = len-m; i >= 0; i-=m){
            answer += score[i]*m;
            System.out.print(score[i]);
        }
        return answer;
    }
}