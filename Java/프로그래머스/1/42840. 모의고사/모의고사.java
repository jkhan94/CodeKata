/*
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
문제번호 = 인덱스를 비교해서 맞으면 count[학생번호-1]++
최고 점수를 구하고, 그 점수와 동일한 점수를 받은 학생들을 리스트에 추가
*/
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                count[0]++;
            }
            if (answers[i] == student2[i % student2.length]) {
                count[1]++;
            }
            if (answers[i] == student3[i % student3.length]) {
                count[2]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                ans.add(i + 1);
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }
}

/*
리스트 -> 원시타입 배열로 변한할 때 스트리 사용가능.
intValue() : Integer -> int
파라미터 i를 받아서 -> i.intValue() (실행문) 실행
*/
/*
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();

        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}

        return list.stream().mapToInt(i->i.intValue()).toArray();

    }

}
*/