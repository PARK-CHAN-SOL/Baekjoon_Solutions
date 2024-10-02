class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int len = number.length();
        
        //0 부터 k 번째 까지 가장 큰 수(문자)를 찾는다
        //가장 큰 수의 인덱스를 i라고 할 때 i 부터 k + 1번째 까지 가장 큰 수를 찾는다
        //len번째까지 반복한다
        int idx = 0;
        while(k < len){
            char max = '0';
            for(int i = idx; i <= k; i++){
                if(max < number.charAt(i)) {
                    max = number.charAt(i);
                    idx = i+1;
                }
            }
            answer.append(max);
            k++;
        }
        
        return answer.toString();
    }
}