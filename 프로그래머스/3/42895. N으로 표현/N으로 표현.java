import java.util.*;
class Solution {
    public int solution(int N, int number) {
        if(N == number) return 1;
        
        List<Set<Integer>> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        list.add(new HashSet<Integer>());
        
        for(int i = 1; i <= 8; i++){
            sb.append(N);
            list.add(new HashSet<Integer>());
            list.get(i).add(Integer.parseInt(sb.toString()));
        }
        
        for(int i = 2; i <= 8; i++){
            for(int j = 1; j < i; j++){
                for(Integer numK : list.get(i-j)){
                    for(Integer numJ : list.get(j)){
                        list.get(i).add(numK + numJ);
                        list.get(i).add(numK - numJ);
                        list.get(i).add(numK * numJ);
                        if(numJ != 0) list.get(i).add(numK / numJ);
                    }
                }
            }
            if(list.get(i).contains(number)) return i;
        }
                   
        return -1;
    }
}