import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        int len = phone_book.length;
        int max = 0;
        int min = 21;
        
        Arrays.sort(phone_book, (s1, s2)->{
            return s1.length() - s2.length() == 0 ? s1.compareTo(s2) : s1.length() - s2.length();
        });
        
        for(int i = 0; i < len; i++){
            max = Math.max(max,phone_book[i].length());
            min = Math.min(min,phone_book[i].length());
        }
        
        HashSet<String> set = new HashSet<>();
        for(int i = min; i < max; i++){
            for(int j = 0; j < len; j++){ 
                
                if(phone_book[j].length() > i && set.contains(phone_book[j].substring(0,i))) return false;
                else set.add(phone_book[j]);
                             
            }
            set.clear();
        }
        
        return true;
    }
}