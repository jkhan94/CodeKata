package programmers;

import java.util.ArrayList;

/*
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
문제번호 = 인덱스를 비교해서 맞으면 count[학생번호-1]++
최고 점수를 구하고, 그 점수와 동일한 점수를 받은 학생들을 리스트에 추가
*/
public class MockExam {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};

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

        for (int item : answer) {
            System.out.println(item);
        }

    }
}
