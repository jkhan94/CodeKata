/*
가로 * 세로 - 1

M-1번 자르면 가로가 1, 세로가 N인 직사각형이 M개 생김.
M개 직사각형의 세로를 N-1번 자르면 모든 세로 길이가 1이 됨.
(M-1) + M*(N-1) = M*N-1
*/
class Solution {
    public int solution(int M, int N) {
        return M*N-1;
    }
}