class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }          
        }
        
        // 문자열.repeat(n)을 하면 문자열을 n번 반복. hellohellohello
        // String[] str = my_string.split("");
        // for(int i=0; i<my_string.length(); i++){
        //     answer += str[i].repeat(n);
        // }
        
        return answer;
    }
}