/*
banana length = 6
012345

ana 345 length=3
a 5 length=1 = length-idx
*/
class Solution {
    public int solution(String my_string, String is_suffix) {
        int idx = my_string.lastIndexOf(is_suffix);
        int myLen = my_string.length();
        int suffLen = is_suffix.length();
        
        
        if(suffLen<=myLen && myLen-idx==suffLen){
            return 1;
        }
        
        return 0;
    }
}