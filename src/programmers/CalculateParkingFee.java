package programmers;

import java.util.*;

/*
fees : 기본시간 기본요금 단위시간 단위요금

records : 시각HH:MM 차량번호1234 내역(IN, OUT)
시각 오름차순 정렬

공백 기준 split해서 차량번호, 시각, 내역 순으로 재정렬
0  3 4   8 910
0202 16:00 IN

차별로 누적 주차시간을 구해야 함.
record를 작은 차량번호 순으로 정렬해서 OUT이 없으면 23:59 - IN, 있으면 OUT - IN
주차시간 - fees[0] : <0이면 요금: fees[1]
            >0이면 요금: fees[1] + CEIL(남은시간/fees[2])*fees[3]

*/
public class CalculateParkingFee {
    public static void main(String[] args) {
        int[] fees = {120, 0, 60, 591};
        String[] records = {"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"};
        String[] temp = new String[3];
        String[] record = new String[records.length];
        int idx = 1;
        int time = 0;
        String in = "";
        String out = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            temp = records[i].split(" ");
            record[i] = temp[1] + temp[0] + temp[2];
        }
        Arrays.sort(record);

        idx = 0;
        while (idx <= records.length - 1) {
            in = record[idx].substring(0, 4);
            if (idx < records.length - 1){
                out = record[idx + 1].substring(0, 4);
            }
            if (!in.equals(out) || idx == records.length-1) {
                time = (23 - Integer.parseInt(record[idx].substring(4, 6))) * 60 + (59 - Integer.parseInt(record[idx].substring(7, 9)));
                map.put(in, map.getOrDefault(in, 0) + time);
                idx = idx + 1;
            } else {
                time = (Integer.parseInt(record[idx + 1].substring(4, 6)) - Integer.parseInt(record[idx].substring(4, 6))) * 60 + Integer.parseInt(record[idx + 1].substring(7, 9)) - Integer.parseInt(record[idx].substring(7, 9));
                map.put(in, map.getOrDefault(in, 0) + time);
                idx = idx + 2;
            }
        }

        List<String> cars = new ArrayList<>(map.keySet());
        Collections.sort(cars);
        int[] answer = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(map.get(cars.get(i)));
            time = map.get(cars.get(i));
            if ((time - fees[0]) <= 0) {
                answer[i] = fees[1];
            } else {
                int q = (time - fees[0]) / fees[2];
                if ((time - fees[0]) % fees[2] != 0) {
                    q += 1;
                }
                answer[i] = fees[1] + q * fees[3];
            }
        }

        for (int a : answer) {
            System.out.println(a);
        }

    }
}

