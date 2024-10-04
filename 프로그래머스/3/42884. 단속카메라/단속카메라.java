import java.util.Arrays;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int preLocation = -30001;
        int len = routes.length;
        
        Arrays.sort(routes, (range1, range2)->{
           return range1[1] - range2[1]; 
        });
        
        for(int i = 0; i < len; i++){
            if(routes[i][0] > preLocation){
                preLocation = routes[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}