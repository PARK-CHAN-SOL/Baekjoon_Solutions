import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int[] sc2 = new int[k+1];
        for(int i=0; i<score.length; i++) sc2[score[i]]++; 
        int sum=0, mod=0;
        for(int i=k; i>0; i--){         
            sc2[i]=sc2[i] + mod;       
            sum += sc2[i]/m * m * i;    
            mod = sc2[i]%m;             
        }
        return sum;
    }
}