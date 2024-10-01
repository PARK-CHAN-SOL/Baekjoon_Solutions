class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int min = len;
        
        char[] arr = name.toCharArray();
        
        int pre = 0;
        for(int i = 0; i < len; i++){
            // 각 알파벳을 만들기 위한 조작 횟수를 answer에 더함
            if(arr[i] != 'A'){
                if(arr[i] <= 'N'){
                    answer += (int)(arr[i] - 'A');
                } else {
                    answer += (int)('Z' - arr[i]) + 1;
                }
                
                //전에 문자를 조작한 위치에서 현재 위치까지 뒤로 도달하는 경우의 이동 거리
                int goBack = pre + len - i;
                
                //앞으로 갔다가 뒤로 간거 vs 뒤로 갔다가 뒤로 간거
                min = Math.min(min, Math.min(pre + goBack, len - i + goBack));
                pre = i;
            }
        }
        min = Math.min(min, pre);
        
        return answer + min;
    }
}