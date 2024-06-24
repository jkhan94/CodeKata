package programmers;

public class SubStringProgrammers {
    public static void main(String[] args) {
        String t = "5000";
        String p = "4000";
        String temp="";
        int answer = 0;
        Long n1 = 0L, n2 = 0L;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            temp = t.substring(i, i + p.length());
            n1 = Long.parseLong(p);
            n2 = Long.parseLong(temp);
            if (n1 >= n2) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
