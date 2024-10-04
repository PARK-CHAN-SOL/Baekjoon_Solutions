import java.util.Arrays;
class Solution {
    public static int find(int[] arr, int i){
        if(arr[i] == i) return i;
        return find(arr, arr[i]);
    }
    public static void union(int[] arr, int a, int b){
        int aParent = find(arr, a);
        int bParent = find(arr, b);
        
        if(aParent > bParent) arr[aParent] = bParent;
        else arr[bParent] = aParent;
    }
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] arr = new int[n];
        int len = costs.length;
        
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }
        
        Arrays.sort(costs, (cost1, cost2)->{
            return cost1[2]-cost2[2];
        });
            
        for(int i = 0; i < len; i++){
            if(find(arr, costs[i][0]) != find(arr, costs[i][1])){
                answer += costs[i][2];
                union(arr, costs[i][0], costs[i][1]);
            }
        }
        
        return answer;
    }
}