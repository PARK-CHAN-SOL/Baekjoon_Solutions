class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] charArray = new char[n][n];
        for (int i = 0; i < n; i++){
            arr1[i] = arr1[i] | arr2[i];
            charArray[i] = Integer.toBinaryString(arr1[i]).toCharArray();
            for(int j = 0; j < n; j++){
                if(charArray[i][j] == '1') charArray[i][j] = '#';
                else charArray[i][j] = ' ';
            }
            answer[i] = String.valueOf(charArray[i]);
        }
        return answer;
    }
}