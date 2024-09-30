class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;
        
        int len = sizes.length;
        
        for(int i = 0; i < len; i++){
            if(sizes[i][0] > sizes[i][1]) {
                if(w < sizes[i][0]) w = sizes[i][0];
                if(h < sizes[i][1]) h = sizes[i][1];
            } else {
                if(w < sizes[i][1]) w = sizes[i][1];
                if(h < sizes[i][0]) h = sizes[i][0];
            }
            
        }
        
        answer = w * h;
        return answer;
    }
}