package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Process {
    public static void main(String[] args) {
        int[] priorities = {2};
        int location = 0;
        int answer = 0;
        int temp = 0;
        int max=0;
        Integer[] p = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
        Queue<Integer> q = new LinkedList<>(Arrays.asList(p));

        while (!q.isEmpty()) {
            temp = q.poll();
            if(!q.isEmpty()){
                max=Collections.max(q);
            } else {
                max=temp;
            }
            if (temp < max) {
                q.offer(temp);
                if (location == 0) {
                    location = q.size() - 1;
                } else{
                    location--;
                }
                System.out.print(location);
                System.out.print(q);
                System.out.println(answer);
            } else {
                answer++;
                System.out.print(location);
                System.out.print(q);
                System.out.println(answer);
                if (location == 0) {
                    break;
                } else {
                    location--;
                }
            }
        }

        System.out.println(answer);
    }
}
