class Solution {
    public int solution(String arr[]) {
        int len = arr.length;
        int halfLen = len / 2 + 1;
        int[] nums = new int[halfLen];
        boolean[] opers = new boolean[halfLen-1];
        
        int operPtr = 0;
        int numPtr = 0;
        
        for(int i = 0; i < len; i++){
            if(arr[i].equals("+")) opers[operPtr++] = true;
            else if(arr[i].equals("-")) operPtr++;
            else nums[numPtr++] = Integer.parseInt(arr[i]);
        }
        
        
        int[][][] dp = new int[halfLen][halfLen][2];
        
        for(int i = 0; i < halfLen; i++){
            dp[i][i][0] = nums[i];
            dp[i][i][1] = nums[i];
        }
        
        for(int i = 1; i < halfLen; i++){
            for(int j = 0; j < halfLen; j++){
                int end = i + j;
                if(end >= halfLen) break;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int k = j; k < end; k++){
                    if(opers[k]) {
                        max = Math.max(max, dp[j][k][1] + dp[k+1][end][1]);
                        min = Math.min(min, dp[j][k][0] + dp[k+1][end][0]);
                    } else {
                        max = Math.max(max, dp[j][k][1] - dp[k+1][end][0]);
                        min = Math.min(min, dp[j][k][0] - dp[k+1][end][1]);
                    }
                }
                dp[j][end][1] = max;
                dp[j][end][0] = min;
            }
        }
        
        return dp[0][halfLen-1][1];
    }
}