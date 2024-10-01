import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int len = wires.length;
        int answer = (n & 1);
        int min = n;
        Queue<Integer> queue = new LinkedList<>();
        
        //하나를 끊고 아무거나 완전탐색, 총 개수에서 뺀다.
        for(int i = 0; i < len; i++){
            int count = 1;
            boolean[] visit = new boolean[n];
            visit[i] = true;
            queue.offer(wires[i][0]);
            while(!queue.isEmpty()){
                int a = queue.peek();
                for(int j = 0; j < len; j++){                
                    if(!visit[j] && (wires[j][0] == a || wires[j][1] == a)){
                        visit[j] = true;
                        if(wires[j][0] == a) queue.offer(wires[j][1]);
                        if(wires[j][1] == a) queue.offer(wires[j][0]);
                        count++;
                    }
                }
                queue.poll();
            }
            if(min > Math.abs(n - (count<<1))) min = Math.abs(n - (count<<1));
        }
        
        return min;
    }
}