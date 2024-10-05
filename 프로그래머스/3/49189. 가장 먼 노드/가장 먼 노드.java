import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int len = edge.length;
        
        ArrayList<ArrayList<Integer>> gragh = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            gragh.add(new ArrayList<Integer>());
        }
        
        //인접리스트 구현
        for(int i = 0; i < len; i++){
            gragh.get(edge[i][0]).add(edge[i][1]);
            gragh.get(edge[i][1]).add(edge[i][0]);
        }
        
        boolean[] visit = new boolean[n+1]; //방문한 노드 표시
        int[] step = new int[n+1]; //해당 노드까지 최단거리를 담는 배열
        Queue<Integer> queue = new LinkedList<>();
        
        visit[1] = true;
        queue.offer(1);
        
        
        //bfs
        while(!queue.isEmpty()){
            int node = queue.poll();
            ArrayList<Integer> list = gragh.get(node);
            for(int i = 0; i < list.size(); i++){
                int nextNode = list.get(i); 
                if(!visit[nextNode]){
                    visit[nextNode] = true;
                    queue.offer(nextNode);
                    step[nextNode] =  step[node] + 1;
                }
            }
        }
        
        Arrays.sort(step);
        
        int max = step[n];
        for(int i = n; i > 0; i--){
            if(step[i] == max) answer++;
            else break;
        }
        
        return answer;
    }
}