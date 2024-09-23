class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        sb.append(Integer.toString(n, 3));
        sb.reverse();
        answer = Integer.valueOf(sb.toString(), 3);
        
        return answer;
    }
}