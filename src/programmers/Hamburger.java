package programmers;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    public static void main(String[] args) {
        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        int i=0;

        for (int item : ingredient) {
            list.add(item);
        }

        System.out.println(list);

        while (list.size()>=4) {
            if (list.get(i) == 1 && list.get(i + 1) == 2
                    && list.get(i + 2) == 3 && list.get(i + 3) == 1) {
                answer++;
                for (int j = i + 3; j >= i; j--) {
                    list.remove(j);
                }
                i = 0;
                System.out.println(answer + " " + list);
            } else{
                i++;
            }

            if(i == list.size()-3){
                break;
            }
        }
    }
}
