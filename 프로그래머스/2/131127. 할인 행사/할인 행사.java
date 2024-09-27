import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int len = want.length;
        int len2 = discount.length;
        HashMap<String, Integer> map = new HashMap<>();
        
        Queue<String> queue = new LinkedList<>();
        
        for (int i = 0; i < len; i++){
            map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < len2; i++){
            queue.add(discount[i]);
            String tmp = "";
            
            if(queue.size() > 10) {
                tmp = queue.poll();
            }
            
            if(map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            }
            
            if(map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i]) - 1);
            }
            
            answer++;
            for(int j = 0; j < len; j++){
                if(map.get(want[j]) > 0) {
                    answer--;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}