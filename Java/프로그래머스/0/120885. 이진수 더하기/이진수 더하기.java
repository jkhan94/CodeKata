/*
Integer.parseInt(String "숫자 문자열", int 진법);
진법으로 문자열을 읽어서 10진수 int로 반환

Integer.toBinaryString(decimal);
10진수 -> 2진수

Integer.toString(int 숫자, int 진법);

*/
class Solution {
    public String solution(String bin1, String bin2) {
        int b1 = Integer.parseInt(bin1, 2);
        int b2 = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(b1+b2);
         // return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);
    }
}