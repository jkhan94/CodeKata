/*
∧ AND / ∨ OR

|, & : 비트OR, 비트AND. 
        양쪽 모두 평가.
        boolean이면 논리연산, int 같은 정수면 비트 연산

||, && : 논리OR, 논리AND.
            단축 평가(하나라도 참이나 거짓이면 값 반환) => 성능 최적확
*/
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}