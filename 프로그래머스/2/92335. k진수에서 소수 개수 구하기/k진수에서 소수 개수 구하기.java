class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(n, k));
        int len = sb.length();
        int tmp = 0;
        
        for(int i = 0; i < len; i++){
            if(sb.charAt(i) == '0') {
                tmp = i+1;
            } else if(i+1 == len|| sb.charAt(i+1) == '0'){
                answer++;
                
                long p = Long.parseLong(sb.substring(tmp, i+1));
                if(p == 1L) answer--;
                
                int sqrtP = (int)Math.sqrt(p);

                for(int ii = 2; ii <= sqrtP; ii++){
                    if(p % ii == 0L) {
                        answer--;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}