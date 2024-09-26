import java.util.HashSet;
class Solution {
    public void setPut (HashSet<Integer> set, int[] arr, int limit, int depth){
        if(limit < depth) return;
        for(int i = 0; i < limit; i++){
            int sum = 0;
            for (int j = 0; j < depth; j++){
                sum += arr[i+j];
            }
            set.add(sum);
        }
        setPut(set, arr, limit, depth+1);
    }
    public int solution(int[] elements) {
        int len = elements.length;

        int[] circle = new int[len<<1];

        for(int i = 0; i < len; i++){
            circle[i] = elements[i];
            circle[i+len] = elements[i];
        }

        HashSet<Integer> set = new HashSet<>();

        setPut(set, circle, len, 1);

        return set.size();
    }
}
