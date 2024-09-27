import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        LinkedList<String> queue = new LinkedList<>();
        
        int len = cities.length;
        
        for(int i = 0; i < len; i++){
            String lower = cities[i].toLowerCase();
            
            if(queue.contains(lower)) {
                queue.remove(queue.indexOf(lower));
                answer += 1;
            } else {
                answer += 5;
            }
            queue.offer(lower);
            
            if(queue.size() > cacheSize) queue.poll();
        }
        
        return answer;
    }
}