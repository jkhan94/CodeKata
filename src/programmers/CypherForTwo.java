package programmers;

import java.util.LinkedList;

public class CypherForTwo {
    public static void main(String[] args) {
        String s = "z";
        String skip = "abcdefghij";
        int index = 20;
        String answer = "";
        String[] lowers = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] excludes = skip.split("");
        String[] givens = s.split("");
        LinkedList<String> usables = new LinkedList<>();
        int idx = 0;

        for (int i = 0; i < excludes.length; i++) {
            for (int j = 0; j < lowers.length; j++) {
                if (excludes[i].equals(lowers[j])) {
                    lowers[j] = "";
                }
            }
        }

        for (int j = 0; j < lowers.length; j++) {
            if (!lowers[j].equals("")) {
                usables.add(lowers[j]);
            }
        }

        for (int i = 0; i < givens.length; i++) {
            idx = usables.indexOf(givens[i]) + index;
            if (idx >= usables.size()) {
                idx = idx % usables.size();
            }
            answer += usables.get(idx);
        }
    }
}
