import java.util.Queue;
import java.util.LinkedList;
class Solution {    
    public void bfs (int[][] maps, boolean[][] check, int n, int m){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
                
        int[] xArr = new int[]{1, 0, -1, 0};
        int[] yArr = new int[]{0, 1, 0, -1};
        
        while(!queue.isEmpty()){
            int[] next = queue.poll();
            int x = next[0];
            int y = next[1];
            
            if(x == n-1 && y == m-1) return;
            
            for(int i = 0; i < 4; i++){
                int nextX = x + xArr[i];
                int nextY = y + yArr[i];
                
                if(nextX == n || nextY == m ||
                   nextX == -1 || nextY == -1 ||
                   check[nextX][nextY] || maps[nextX][nextY] == 0) continue;
                
                check[nextX][nextY] = true;
                queue.offer(new int[]{nextX, nextY});
                maps[nextX][nextY] += maps[x][y];
            }
            
        }
        maps[n-1][m-1] = -1;
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] check = new boolean[n][m];
        check[0][0] = true;
        
        bfs(maps, check, n, m);
        
        return maps[n-1][m-1];
    }
}