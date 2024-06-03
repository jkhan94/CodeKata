/*
A 65 a 97
Z 90 z 122
*/
public class PushStringByN {
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        String[] temp = s.split("");
        String answer = "";

        for (String item : temp) {
            if (item.equals(" ")) {
                answer += item;
            } else {
                int ascii = item.charAt(0);
                if ((ascii <= 90 && ascii + n > 90) || (ascii >= 97 && ascii + n > 122)) {
                    ascii = ascii + n - 26; // 대문자
                } else{
                    ascii += n;
                }
                answer += (char) ascii;
            }
        }
        System.out.println(answer);
    }
}
