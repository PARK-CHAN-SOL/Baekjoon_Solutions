import java.util.HashMap;
class Solution {
    public int solution(String word) {
        int answer = 0;
        
        int[][] count = {{1,782,1563,2344,3125},{1,157,313,469,625},{1,32,63,94,125},{1,7,13,19,25},{1,2,3,4,5}};
        
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 0); map.put('E', 1); map.put('I', 2); map.put('O', 3); map.put('U', 4);
        
        for(int i = 0; i < word.length(); i++){
            answer += count[i][map.get(word.charAt(i))];
        }
        
        return answer;
    }
}