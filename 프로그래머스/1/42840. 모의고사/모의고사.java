class Solution {
    public int[] solution(int[] answers) {
        int len = answers.length;
        
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        for(int i = 0; i < len; i++){
            switch(i % 5){
                case 0: if(answers[i] == 1) p1++; break;
                case 1: if(answers[i] == 2) p1++; break;
                case 2: if(answers[i] == 3) p1++; break;
                case 3: if(answers[i] == 4) p1++; break;
                case 4: if(answers[i] == 5) p1++; break;
            }
            switch(i % 8){
                case 0: if(answers[i] == 2) p2++; break;
                case 1: if(answers[i] == 1) p2++; break;
                case 2: if(answers[i] == 2) p2++; break;
                case 3: if(answers[i] == 3) p2++; break;
                case 4: if(answers[i] == 2) p2++; break;
                case 5: if(answers[i] == 4) p2++; break;
                case 6: if(answers[i] == 2) p2++; break;
                case 7: if(answers[i] == 5) p2++; break;
            }
            switch(i % 10){
                case 0: if(answers[i] == 3) p3++; break;
                case 1: if(answers[i] == 3) p3++; break;
                case 2: if(answers[i] == 1) p3++; break;
                case 3: if(answers[i] == 1) p3++; break;
                case 4: if(answers[i] == 2) p3++; break;
                case 5: if(answers[i] == 2) p3++; break;
                case 6: if(answers[i] == 4) p3++; break;
                case 7: if(answers[i] == 4) p3++; break;
                case 8: if(answers[i] == 5) p3++; break;
                case 9: if(answers[i] == 5) p3++; break;
            }
        }
        
        int max = Math.max(p1, Math.max(p2, p3));
        
        if(max == p1 && max == p2 && max == p3){
            return new int[]{1, 2, 3};
        } else if(max == p1 && max == p2){
            return new int[]{1, 2};
        } else if(max == p1 && max == p3){
            return new int[]{1, 3};
        } else if(max == p2 && max == p3){
            return new int[]{2, 3};
        } else if(max == p1){
            return new int[]{1};
        } else if(max == p2){
            return new int[]{2};
        } else {
            return new int[]{3};
        }
    }
}