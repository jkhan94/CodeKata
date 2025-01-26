// 1  2 3   0
// 1 22 333 0 333 22 1
class Solution {
    public String solution(int[] food) {       
        String answer = "";

        for(int i = 1; i < food.length; i++) {
            for(int j=0; j<food[i]/2;j++){
                answer += Integer.toString(i);
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        answer+="0";
        answer+=reverse;
        return answer;
    }
}
/*
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;

    }

}
*/