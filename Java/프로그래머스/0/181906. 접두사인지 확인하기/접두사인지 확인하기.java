/*
class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)){
            return 1;
        }
        
        return 0;
    }
}
*/

// 문자열이 포함되어 있고 && 인덱스가 0이면 접두사
// 포함되어 있지 않다면 -1 리턴하니까 contains는 불필요.
class Solution {
    public int solution(String my_string, String is_prefix) {        
        if(my_string.indexOf(is_prefix)==0){
            return 1;
        }
        
        return 0;
    }
}
