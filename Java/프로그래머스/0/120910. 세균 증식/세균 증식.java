/*
n * 2^t
*/
class Solution {
    public int solution(int n, int t) {
        return (int)(n * Math.pow(2,t));        
        // return n << t; // 왼쪽 시프트는 *2. t번 밀면 됨
    }
}