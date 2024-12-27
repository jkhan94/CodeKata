/*
0 1 2 3 4 5 6
3 1 4 1 5 9 2 = 7
271 = 3
0 ~ t.length-2
*/
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(p) >= 
                  Long.parseLong(t.substring(i, i + p.length()))) {
                answer++;
            }
        }
        
        return answer;
    }
}