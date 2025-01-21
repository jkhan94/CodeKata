/*
점수를 저장한 리스트를 내림차순 정렬한 뒤 같은 값이 나오면 인덱스+1
중복 점수는 두 번 저장되지만 앞쪽에 저장된 값을 기준으로 등수가 정해짐.

[[80, 70], [90, 50], [40, 70], [50, 80]]
75 70 55 65 
[75, 70, 65, 55]

[[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]
75 75 40 95 95 100 20 
[100, 95, 95, 75, 75, 40, 20]

테스트케이스 추가 
[[1, 3], [3, 1], [2, 3], [3, 2], [1, 2], [1, 1]]
[3, 3, 1, 1, 5, 6]

그런데 전부 /2 하면, 합으로만 따져도 되지 않나.
*/
/*
import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Double> avg = new ArrayList<>();
        double[] avg2 = new double[score.length];
        double temp = 0;
        
        for(int i=0; i<answer.length; i++){
            temp = (double)(score[i][0] + score[i][1])/2;
            avg.add(temp);
            avg2[i] = temp;
        }

        Collections.sort(avg, Collections.reverseOrder()); // DESC

        for(int i=0; i<avg2.length; i++){
            for(int j=0; j<avg.size(); j++){
                if(avg2[i] == avg.get(j)){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
*/
import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> avg = new ArrayList<>();
        
        for(int i=0; i<answer.length; i++){
            avg.add(score[i][0] + score[i][1]);
            answer[i] = score[i][0] + score[i][1];
        }

        Collections.sort(avg, Collections.reverseOrder()); // DESC

        for(int i=0; i<answer.length; i++){
            for(int j=0; j<avg.size(); j++){
                if(answer[i] == avg.get(j)){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}