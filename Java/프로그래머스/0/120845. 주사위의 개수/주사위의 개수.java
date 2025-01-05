/*
직육면체 가로, 세로, 높이를 정육면체의 한 변으로 나눈 몫들의 곱
*/
class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i=0; i<box.length; i++){
            answer *= box[i]/n;
        }
        return answer;
    }
}