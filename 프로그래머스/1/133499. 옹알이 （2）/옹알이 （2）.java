class Solution {
    public int solution(String[] babbling) {
        int len = babbling.length;
        int answer = len;
        for(int i = 0; i < len; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(babbling[i]);
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye")
               || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                answer--;
                continue;
            }
            while(sb.length() != 0){
                int len2 = sb.length();
                String sub2 = "";
                String sub3 = "";
                
                boolean flag = false;
                if(len2 > 1){
                    sub2 = sb.substring(len2-2,len2);
                    switch(sub2){
                        case "ye": sb.setLength(len2 - 2); flag = true; break;
                        case "ma": sb.setLength(len2 - 2); flag = true; break;
                    }
                }
                
                if(!flag && len2 > 2){
                    sub3 = sb.substring(len2-3,len2);
                    switch(sub3){
                        case "aya": sb.setLength(len2 - 3); flag = true; break;
                        case "woo": sb.setLength(len2 - 3); flag = true; break;
                    }
                }
                
                if(!flag) {
                    answer--;
                    break;
                }
                
            }
        }
        return answer;
    }
}