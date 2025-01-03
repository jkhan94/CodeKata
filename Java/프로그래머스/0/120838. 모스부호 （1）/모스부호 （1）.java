class Solution {
    private String[] morse = { 
        ".-","-...","-.-.","-..",".", "..-.",
        "--.", "....", "..",".---","-.-",".-..",
        "--","-.","---",".--.","--.-",".-.",
        "...","-","..-","...-",".--","-..-",
        "-.--","--.."
    };
    
    public String solution(String letter) {
        String answer = "";
        String[] splited = letter.split(" ");
        for(String s : splited){
            for(int i=0; i<morse.length; i++){
                if(s.equals(morse[i])){
                    answer += (char)(i+'a');
                    break;
                }
            }
        }
        return answer;
    }
}