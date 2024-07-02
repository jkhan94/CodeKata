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

        Map<String, HashSet<String>> reportedMap = new HashMap<>();
        HashSet<String> reporterSet = new HashSet<>();

        for(int i=0; i<id_list.length;i++){
            reportedMap.put(id_list[i],new HashSet<String>());
        }

        // 당한자, 신고자들
        for(int i=0; i<report.length;i++){
            reporter = report[i].split(" ")[0];
            reported = report[i].split(" ")[1];
            reportedMap.get(reported).add(reporter);
        }

        // System.out.println(reportedMap);

        // set의 크기가 k보다 크면 정지
        // set에 저장된 유저들의 이메일 수++
        for(int i=0; i<id_list.length;i++){
            reporterSet = reportedMap.get(id_list[i]);
            if(reporterSet.size() >= k){
                // System.out.println(id_list[i]+":"+reporterSet);
                for(String name : reporterSet){
                    answer[Arrays.asList(id_list).indexOf(name)]++;
                }
            }
        }
    }
}
