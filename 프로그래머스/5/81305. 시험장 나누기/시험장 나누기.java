class Solution {
    static int numLen;
    static int[][] nodes;
    static int parentAll;
    static int count;
    
    public boolean check(int mid, int k, int[][] links){
        count = 0;
        dfs(parentAll, mid, links);
        if(count < k) return true;
        return false;
    }
    
    public int dfs (int node, int mid, int[][] links) {
        // check: false
        if(nodes[node][0] > mid) {
            count = numLen+1;
            return 100000000;
        }
        
        // 부모 노드가 없다면 자기 자신 리턴
        if(links[node][0] == -1 && links[node][1] == -1) return nodes[node][0];
        
        int num = nodes[node][0];
        int leftSum = 0;
        int rightSum = 0;
        
        // 왼쪽 합
        if(links[node][0] != -1) leftSum = dfs(links[node][0], mid, links);
        
        // 오른쪽 합
        if(links[node][1] != -1) rightSum = dfs(links[node][1], mid, links);
        
        // 보다 큰 쪽을 끊는다
        if(leftSum + num > mid && rightSum + num > mid){
            count+=2;
            return num;
        }
        
        if(leftSum + num > mid) {
            count++;
            return rightSum + num;
        }
        
        if(rightSum + num > mid){
            count++;
            return leftSum + num;
        }
        
        if(leftSum + rightSum + num > mid) {
            if(leftSum > rightSum){
                count++;
                return rightSum + num; 
            }else{
                count++;
                return leftSum + num; 
            }
        }
        
        return leftSum + rightSum + num;
    }
    
    public int solution(int k, int[] num, int[][] links) {
        
        numLen = num.length;
        
        nodes = new int [numLen][4];
        
        int sum = 0;
        
        // 0: num                   , 1: left node's num, 
        // 2: parent node's index   , 3: right node's num
        for (int i = 0; i < numLen; i++){
            nodes[i][0] = num[i];
            nodes[i][2] = -1;
            sum += num[i];
        }
        
        for(int i = 0; i < numLen; i++){
            if(links[i][0] != -1) {
                nodes[i][1] = nodes[links[i][0]][0];
                nodes[links[i][0]][2] = i;
            }
            if(links[i][1] != -1) {
                nodes[i][3] = nodes[links[i][1]][0];
                nodes[links[i][1]][2] = i;
            }
        }
        
        for(int i = 0; i < numLen; i++){
            if(nodes[i][2] == -1) {
                parentAll = i;
                break;
            }
        }
        
        int lowerLimit = sum / k;
        int upperLimit = sum;
        int mid;
        
        while(lowerLimit <= upperLimit){
            mid = (lowerLimit + upperLimit) >> 1;
            if(check(mid, k, links)){
                upperLimit = mid-1;
            }else{
                lowerLimit = mid+1;
            }
        }
        
        return lowerLimit;
    }
}