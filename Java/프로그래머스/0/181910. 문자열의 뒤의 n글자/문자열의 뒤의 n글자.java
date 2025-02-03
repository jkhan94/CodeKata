class Solution {
    public String solution(String my_string, int n) {
        // int len = my_string.length();
        // return my_string.substring(len-n, len);
        return my_string.substring(my_string.length()-n); // 시작부터 끝까지 리턴
    }
}