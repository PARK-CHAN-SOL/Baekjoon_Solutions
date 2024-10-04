import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int len = words.length;
        int wordLen = begin.length();
        int idxT = -1;
        
        //bfs를 위한 큐 선언
        Queue<String> queue = new LinkedList<>();
        
        //target이 존재하지 않으면 즉시 리턴
        for(int i = 0; i < len; i++){
            if(words[i].equals(target)){
                idxT = i;
                break;
            }
        }
        if(idxT < 0) return 0;
        
        queue.offer(begin);
        boolean[] visit = new boolean[len];
        
        int step = 1; //변환 횟수를 담는 변수 
        int stack = 1; //n step 시의 큐의 크기
        while(!queue.isEmpty()){
            if(stack == 0) {
                stack = queue.size();
                step++;
            }
            String tmp = queue.poll();
            stack--;
            for(int i = 0; i < len; i++){
                if(!visit[i]){
                    int count = 0;
                    for(int j = 0; j < wordLen; j++){
                        if(tmp.charAt(j) == words[i].charAt(j)) count++;
                    }
                    if(count == wordLen - 1) {
                        if(idxT == i) return step;
                        queue.offer(words[i]);
                        visit[i] = true;
                    } 
                }
            }
        }
        
        return 0;
    }
}