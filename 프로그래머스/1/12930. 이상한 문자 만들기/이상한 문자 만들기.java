class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        int count = 0;
        
        int len = arr.length;
        
        for(int i = 0; i < len; i++){
            if(arr[i] != ' '){
                if((count++ & 1) == 0){
                    if(arr[i] >= 'a') arr[i] -= 32;
                } else if (arr[i] < 'a'){
                    arr[i] += 32;
                }
            } else count = 0;
        }
        
        answer = String.valueOf(arr);
        
        return answer;
    }
}