package programmers;

import java.util.*;

public class KakaoReported {
    public static void main(String[] args) {
        String[] id_list = {"a", "b", "c", "d"};
        String[] report = {"a b", "a b", "c a", "d a", "a b", "c d", "a d", "b c", "b a", "d a"};
        int k = 2;

        int[] answer = new int[id_list.length];
        String reporter = "";
        String reported = "";
        int idx = 0;

        Map<String, Integer> reportedMap = new HashMap<>();
        List<String> reporters = new ArrayList<>();
        List<String> reporteds = new ArrayList<>();

        for (int i = 0; i < report.length; i++) {
            reporter = report[i].split(" ")[0];
            reported = report[i].split(" ")[1];

            if (reporters.contains(reporter) && reporteds.contains(reported)
                    && reporteds.get(reporters.indexOf(reporter)).equals(reported)) {
                continue;
            } else {
                reporters.add(reporter);
                reporteds.add(reported);
            }
        }

        System.out.println(reporters);
        System.out.println(reporteds);

        for (int i = 0; i < id_list.length; i++) {
            if (Collections.frequency(reporteds, id_list[i]) >= k) {
                for (int j = 0; j < reporteds.size(); j++) {
                    if (reporteds.get(j).equals(id_list[i])) {
                        idx = Arrays.asList(id_list).indexOf(reporters.get(j));
                        answer[idx]++;
                    }
                }
            }
        }
    }
}
