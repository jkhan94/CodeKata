/*
먹은 양꼬치: n
마신 음료수 개수: k - n/10
*/
class Solution {
    private static final int FOOD_PRICE = 12000; // 양꼬치 1인분 값
    private static final int DRINK_PRICE = 2000; // 음료수 1개 값
    
    public int solution(int n, int k) {
        int answer = n*FOOD_PRICE + (k - n/10)*DRINK_PRICE;
        return answer;
    }
}