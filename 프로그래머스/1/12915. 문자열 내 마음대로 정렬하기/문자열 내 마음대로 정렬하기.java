import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            return (s1.charAt(n)-s2.charAt(n)) == 0 ? s1.compareTo(s2) : s1.charAt(n)-s2.charAt(n);
        });
            
        return strings;
    }
}