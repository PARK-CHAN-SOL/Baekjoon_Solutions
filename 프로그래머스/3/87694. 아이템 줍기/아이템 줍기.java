import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        //왼쪽이 0이라면 앞으로, 앞이 0이라면 오른쪽으로
        //오른쪽이 0이라면 앞으로, 앞이 0이라면 왼쪽으로
        int len = rectangle.length;
        
        //직사각형의 형상을 2배로 확장된 map 변수에 담음
        int[][] map = new int[102][102];
        for(int i = 0; i < len; i++){
            for(int j = (rectangle[i][0] << 1); j <= (rectangle[i][2] << 1); j++){
                for(int k = (rectangle[i][1] << 1); k <= (rectangle[i][3] << 1); k++){
                    if(j == (rectangle[i][0] << 1) || j == (rectangle[i][2] << 1) || 
                      k == (rectangle[i][1] << 1) || k == (rectangle[i][3] << 1)){
                        
                        map[j][k] = 1;
                        
                    }
                }
            }
        }
        
        //도형의 외곽을 따라 움직이도록 각 직사각형의 내부를 0으로 초기화
        for(int i = 0; i < len; i++) {
            for(int j = (rectangle[i][0] << 1) + 1; j <= (rectangle[i][2] << 1) - 1; j++){
                for(int k = (rectangle[i][1] << 1) + 1; k <= (rectangle[i][3] << 1) - 1; k++){
                    map[j][k] = 0;
                }
            }
        }
        
        characterX <<= 1;
        characterY <<= 1;
        itemX <<= 1;
        itemY <<= 1;
        
        //bfs 큐
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{characterX, characterY, 0});
        
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            int z = tmp[2];
            map[x][y] = 0;
            if(x == itemX && y == itemY) {
                answer = (z >> 1) + (z & 1);
                break;
            }
            if(map[x+1][y] == 1) queue.offer(new int[]{x+1, y, z+1});
            if(map[x-1][y] == 1) queue.offer(new int[]{x-1, y, z+1});
            if(map[x][y+1] == 1) queue.offer(new int[]{x, y+1, z+1});
            if(map[x][y-1] == 1) queue.offer(new int[]{x, y-1, z+1});
        }
        
        return answer;
    }
}