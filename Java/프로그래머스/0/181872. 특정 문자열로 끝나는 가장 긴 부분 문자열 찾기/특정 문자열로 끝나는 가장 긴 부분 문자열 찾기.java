class Solution {
    public String solution(String myString, String pat) {
        StringBuffer answer = new StringBuffer();
        return answer.append(myString.substring(0,myString.lastIndexOf(pat))).append(pat).toString();
    }
}