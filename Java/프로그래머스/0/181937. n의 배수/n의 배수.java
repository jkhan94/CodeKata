/*
class Solution {
    public int solution(int num, int n) {
        if(num%n == 0){
            return 1;
        } else {
            return 0;
        }
    }
}
*/
class Solution {
    public int solution(int num, int n) {
        return num%n==0? 1:0;
    }
}