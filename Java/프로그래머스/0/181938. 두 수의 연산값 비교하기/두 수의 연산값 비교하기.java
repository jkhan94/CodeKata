class Solution {
    public int solution(int a, int b) {
        int plus = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        
        if(plus >= 2*a*b){
            return plus;
        } else {
            return 2*a*b;
        }
    }
}