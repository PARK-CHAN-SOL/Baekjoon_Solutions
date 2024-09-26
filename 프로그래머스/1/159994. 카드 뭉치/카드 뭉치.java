class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int len1 = cards1.length;
        int len2 = cards2.length;
        int ptr1 = 0;
        int ptr2 = 0;
        
        int len = goal.length;
        
        for(int i = 0; i < len; i++){
            if(ptr1 < len1 && cards1[ptr1].equals(goal[i])) {
                ptr1++;
                continue;
            } else if (ptr2 < len2 && cards2[ptr2].equals(goal[i])){
                ptr2++;
                continue;
            }
        }
        
        if(ptr1 + ptr2 == len) answer = "Yes";
        else answer = "No";
        
        return answer;
    }
}