import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //lost reserve 겹치면 지움
        HashSet<Integer> set = new HashSet<>();
        int lostLen = lost.length;
        int reserveLen = reserve.length;
        
        for(int i = 0; i < lostLen; i++){
            set.add(lost[i]);
        }
        
        for(int i = 0; i < reserveLen; i++){
            if(set.contains(reserve[i])) {
                set.remove(reserve[i]);
                reserve[i] = -1;
            }
        }
        
        //왼쪽 끝 부터 왼쪽에 빌려줄 수 있으면 빌려주고, 왼쪽에 못 빌려주면 오른쪽에 빌려줌
        Arrays.sort(reserve);
        for(int i = 0; i < reserveLen; i++){
            if(set.contains(reserve[i] - 1)) set.remove(reserve[i]-1);
            else if(set.contains(reserve[i] + 1)) set.remove(reserve[i]+1);
        }

        return n - set.size();
    }
}