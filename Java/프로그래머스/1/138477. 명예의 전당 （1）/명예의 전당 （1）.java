/*
우선순위큐

// 기본형: 우선순위가 낮은 숫자가 먼저 나옴 (작은 숫자)
PriorityQueue<Integer> pQ = new PriorityQueue<>();

// 우선순위가 높은 숫자가 먼저 나옴 (큰 숫자)
PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

// 첫번째 값을 반환하고 제거 비어있다면 null
priorityQueueLowest.poll();

// 첫번째 값 제거 비어있다면 예외 발생
priorityQueueLowest.remove(); 

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 null을 반환
priorityQueueLowest.peek();

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 예외 발생
priorityQueueLowest.element();

// 초기화
priorityQueueLowest.clear();  

내림차순 정렬
k일째 까지는 마지막 점수
k이후부터는 k번째 점수
*/
import java.util.PriorityQueue;
class Solution {
    public int[] solution(int k, int[] score) {
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
        return answer;
    }
}