/*
1칸 건너띄므로 1번 던질 때마다 인덱스 2씩 증가
움직인 칸수 % 배열 길이 = 실제 인덱스
*/
class Solution {
    public int solution(int[] numbers, int k) {
        int idx = (2*(k-1)) % numbers.length;
        return numbers[idx];
        // 배열의 값이 인덱스+1 이라서 이렇게 써도 되긴 함.
        // return (k-1)*2 % numbers.length+1;
    }
}