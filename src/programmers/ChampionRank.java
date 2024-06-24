package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ChampionRank {
    /*
    * 내림차순 정렬
    k일째 까지는 마지막 점수
    k이후부터는 k번째 점수*/
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                priorityQueue.add(score[i]);
                answer[i] = priorityQueue.peek();
            } else {
                if (priorityQueue.peek() < score[i]) {
                    priorityQueue.remove();
                    priorityQueue.add(score[i]);
                }
                answer[i] = priorityQueue.peek();
            }
        }

        System.out.println(Arrays.toString(answer));
    }

}
