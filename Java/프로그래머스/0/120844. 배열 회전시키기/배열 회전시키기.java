/*
오른쪽은 인덱스+1 / 배열 길이 하면 바뀐 인덱스 나옴
왼쪽은 -1이 가장 끝으로 가야 함. -1 + 배열 길이
*/
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];

        if(direction.equals("right")){
            for(int i=0; i<length; i++){
                answer[(i+1)%length] = numbers[i];
            }
        } else { // left
            for(int i=0; i<length; i++){
                if(i<1){
                    answer[i-1+length] = numbers[i];
                } else{
                    answer[i-1] = numbers[i];
                }
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length -1];
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
        } else {
            answer[answer.length - 1] = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }
        }

        return answer;
    }
}
*/