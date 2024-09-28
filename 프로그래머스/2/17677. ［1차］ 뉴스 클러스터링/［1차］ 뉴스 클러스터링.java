import java.util.ArrayList;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
         
        int len1 = str1.length() - 1;
        int len2 = str2.length() - 1;
        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        for(int i = 0; i < len1; i++){
            String tmp = str1.substring(i, i+2);
            char ch1 = tmp.charAt(0);
            char ch2 = tmp.charAt(1);
            
            if(ch1 < 'A' || (ch1 > 'Z' && ch1 < 'a') || ch1 > 'z' ||
               ch2 < 'A' || (ch2 > 'Z' && ch2 < 'a') || ch2 > 'z') continue;
            
            list1.add(tmp);
        }
        
        for(int i = 0; i < len2; i++){
            String tmp = str2.substring(i, i+2);
            char ch1 = tmp.charAt(0);
            char ch2 = tmp.charAt(1);
            
            if(ch1 < 'A' || (ch1 > 'Z' && ch1 < 'a') || ch1 > 'z' ||
               ch2 < 'A' || (ch2 > 'Z' && ch2 < 'a') || ch2 > 'z') continue;
            
            list2.add(tmp);
        }
        
        len1 = list1. size();
        int total = len1 + list2.size();
        int count = 0;
        for(int i = 0; i < len1; i++){
            if(list2.contains(list1.get(i))) {
                list2.remove(list2.indexOf(list1.get(i)));
                count++;
            }
        }
        total -= count;
        
        return total == 0 ? 65536 : (int)((double)count/total*65536);
    }
}