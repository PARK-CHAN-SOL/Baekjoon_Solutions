import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> queueAsc = new PriorityQueue<>();
        PriorityQueue<Integer> queueDesc = new PriorityQueue<>((num1, num2)->{
            return num2 - num1;
        });
        
        int len = operations.length;
        
        for(int i = 0; i < len; i++){
            if(operations[i].startsWith("I ")) {
                int tmp = Integer.parseInt(operations[i].substring(2, operations[i].length()));
                queueAsc.offer(tmp);
                queueDesc.offer(tmp);
            } else if (operations[i].equals("D 1")){
                queueAsc.remove(queueDesc.poll());
            } else {
                queueDesc.remove(queueAsc.poll());
            }
            
        }
        
        if(queueAsc.size() != 0){
            answer[0] = queueDesc.poll();
            answer[1] = queueAsc.poll();
        }
        
        return answer;
    }
}