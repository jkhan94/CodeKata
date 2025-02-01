/*
문자열이 포함되어 있고 && 인덱스가 0이면 접두사
*/
class Solution {
    public int solution(String my_string, String is_prefix) {        
        if(my_string.contains(is_prefix) && my_string.indexOf(is_prefix)==0){
            return 1;
        }
        
        return 0;
    }
}