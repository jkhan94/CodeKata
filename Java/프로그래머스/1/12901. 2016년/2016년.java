// 1/1 금요일
// 윤년이라 2월 29일 총 366일
// 31일: 1 3 5 7 8 10 12
// 인덱스 1이면 금요일
// 2/1 월요일
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int index=0;

        for(int i=0;i<a-1;i++) {
            index += month[i];
        }
        index += b;
        index %= 7;
        answer = day[index];
        return answer;
    }
}