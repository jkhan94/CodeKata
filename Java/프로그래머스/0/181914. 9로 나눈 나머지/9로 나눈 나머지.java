class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int i=0; i<number.length(); i++){
            answer += number.charAt(i) - '0'; //'1'은 아스키코드. 숫자를 원하면 '0'을 빼야 함
            // answer+=Character.getNumericValue(number.charAt(i));
        }
        return answer%9;
    }
}