/*
숫자만 남긴다. 문자를 전부 공백으로 치환.
[^0-9] = [^\\d] = [\\D] = 숫자가 아니면
*/
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] my = my_string.replaceAll("[\\D]"," ").split(" ");
        
        for(String m:my){
            // if(m.matches("\\d+")){
            //     answer += Integer.parseInt(m);
            // }
            if(!m.equals(" ") && !m.equals("")){
                answer += Integer.parseInt(m);
            }
        }
        
        return answer;
    }
}