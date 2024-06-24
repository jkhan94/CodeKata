package programmers;

import java.util.*;

public class SortString {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n =  2;

        String[] answer = new String[strings.length];
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n)+ strings[i]);
        }

        Collections.sort(list);

        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i).substring(1);
        }

        System.out.println(Arrays.toString(answer));
    }
}
