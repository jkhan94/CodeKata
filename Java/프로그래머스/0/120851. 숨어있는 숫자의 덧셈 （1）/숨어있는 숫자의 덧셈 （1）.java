class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String my = my_string.replaceAll("[^1-9]",""); // 자연수만 남김
        for(int i=0; i<my.length(); i++){
            answer += my.charAt(i) - '0';
        }
        return answer;
    }
}