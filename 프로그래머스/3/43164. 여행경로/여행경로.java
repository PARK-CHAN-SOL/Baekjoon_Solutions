import java.util.*;
class Solution {
    static Stack<String> answer = new Stack<>();
    static boolean flag = false;
    public static void dfs (String[][] tickets, int len, boolean[] visit, Stack<String> stack) {
        for(int i = 0; i < len; i++){
            if(!visit[i] && stack.peek().equals(tickets[i][0])) {
                stack.push(tickets[i][1]);
                if(stack.size() == len + 1) {
                    flag = true;
                    return;
                }
                visit[i] = true;
                
                dfs(tickets, len, visit, stack);
                
                if(flag) return;
                visit[i] = false;
                stack.pop();
            }
        }
    }
    public Stack<String> solution(String[][] tickets) {
        int len = tickets.length;
        boolean[] visit = new boolean[len];
        //최초 출발지는 ICN
        answer.push("ICN");
        
        //출발지 순으로 정렬 (출발지가 같다면 목적지 순으로 정렬)
        Arrays.sort(tickets, (arr1, arr2)->{
            if(arr1[0].equals(arr2[0])) return arr1[1].compareTo(arr2[1]);
            return arr1[0].compareTo(arr2[0]);
        });
        
        dfs(tickets, len, visit, answer);
        
        return answer;
    }
}