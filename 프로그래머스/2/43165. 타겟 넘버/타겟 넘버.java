class Solution {
    int count = 0;
    public void dfs (int[] numbers, int len, int idx, int target, int depth){
        if(depth == 0){
            if (target == 0) count++;
            return;
        }
        
        dfs(numbers, len, idx+1, target+numbers[idx], depth-1);
        dfs(numbers, len, idx+1, target-numbers[idx], depth-1);
        
    }
    public int solution(int[] numbers, int target) {
        int len = numbers.length;
        dfs(numbers, len, 0, target, len);
        return count;
    }
}