class Solution {
    int sum = 0;
    int count = 0;
    public void dfs (int[] arr, int len, int index, boolean[] flags, int depth){
        if(depth == 0) {
            count++;
            int sqrtSum = (int)Math.sqrt(sum);
            for(int i = 2; i <= sqrtSum; i++){
                if(sum % i == 0){
                    count--;
                    break;
                }
            }
            return;
        };
        for(int i = index; i < len; i++){
            if(!flags[i]){
                flags[i] = true;
                sum += arr[i];
                dfs(arr, len, i, flags, depth-1);
                sum -= arr[i];
                flags[i] = false;
            }
        }
    }
    public int solution(int[] nums) {
        int answer = -1;

        int len = nums.length;
        
        boolean[] flags = new boolean[len];
        dfs(nums, len, 0, flags, 3);
        
        return count;
    }
}