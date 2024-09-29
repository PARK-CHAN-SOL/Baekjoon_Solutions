class Solution {
    public int solution(int[][] triangle) {
        int len = triangle.length;
        
        for(int i = len-2; i >= 0; i--){
            int len2 = triangle[i].length;
            for(int j = 0; j < len2; j++){
                triangle[i][j] = Math.max(triangle[i][j] + triangle[i+1][j], triangle[i][j] + triangle[i+1][j+1]);
            }
        }
        
        return triangle[0][0];
    }
}