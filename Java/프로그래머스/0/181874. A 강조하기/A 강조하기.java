/*
소문자, a > A, A가 아닌 대문자 > 소문자.
즉 소문자와 대문자 A만 남음.
*/
class Solution {
    public String solution(String myString) {       
        myString = myString.toLowerCase();
        myString = myString.replace("a","A");
        
        
        return myString;
    }
}