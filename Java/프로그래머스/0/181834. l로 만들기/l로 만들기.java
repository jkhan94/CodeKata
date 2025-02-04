/*
[^l-z] : l ~ z가 아니면
*/
class Solution {
    public String solution(String myString) {
        // return myString.replaceAll("[^l-z]", "l");
        return myString.replaceAll("[a-k]", "l");
    }
}
/*
class Solution {
    public String solution(String myString) {
        char[] answer = myString.toCharArray();
        
        for(int i=0; i<answer.length; i++){
            if((int)answer[i]<108){
                answer[i] = 'l';
            }
        }
        
        return String.valueOf(answer);
    }
}
*/