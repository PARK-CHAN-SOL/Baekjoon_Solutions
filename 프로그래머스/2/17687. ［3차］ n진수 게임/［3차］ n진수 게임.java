class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        int len = (t-1) * m + p;
        
        while(sb.length() < len){
            sb.append(Integer.toString(num++, n));
        }
        
        for (int i = p-1; i < len; i+= m) {
            answer.append(sb.charAt(i));
        }
        
        return answer.toString().toUpperCase();
    }
}