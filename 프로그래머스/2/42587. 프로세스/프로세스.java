import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>((num1, num2)->{
            return num2-num1;
        });
        Queue<Integer> Q = new LinkedList<>();
        
        int len = priorities.length;
        
        for(int i = 0; i < len; i++){
            pQ.offer(priorities[i]);
            Q.offer(priorities[i]);
        }
        
        int count = 0;
        
        for(int i = 0; i < len; i++){
            while(pQ.peek() != Q.peek()){
                Q.offer(Q.poll());
                location--;
                if(location == -1) location = Q.size()-1;
            }
            count++;
            if(location == 0) return count;
            pQ.poll();
            Q.poll();
            location--;
        }
        
        return answer;
    }
}