/*
replace : 특수문자, 문자 구분해서 전부 치환
replaceAll : 정규식을 받아 전부 치환.

. : 정규식에선 모든 문자를 의미.
예) 프로.그래.머스
replace(".","/") : 프로/그래/머스
replaceAll(".","/") : ////////
*/
class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A","T").replace("B","A").replace("T","B");
     
        return myString.contains(pat)? 1 : 0;
    }
}
/*
class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A","T");
        myString = myString.replaceAll("B","A");
        myString = myString.replaceAll("T","B");
        
        return myString.indexOf(pat) != -1? 1 : 0;
    }
}
*/