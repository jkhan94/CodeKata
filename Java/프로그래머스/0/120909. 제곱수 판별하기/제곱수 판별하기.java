class Solution {
    public int solution(int n) {
        // if(Math.sqrt(n)%1 == 0.0){
        //     return 1;
        // } else {
        //     return 2;
        // }

        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}