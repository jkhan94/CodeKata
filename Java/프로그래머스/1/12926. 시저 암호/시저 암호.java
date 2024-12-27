/*
A 65 a 97
Z 90 z 122
-26
*/
class Solution {
    public String solution(String s, int n) {
        String answer = "";        
        String[] temp = s.split("");

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
        
        return answer;
    }
}
/*
// 나는 문자열 > 문자 > 아스키코드. 아래는 캐릭터 함수 사용
// 그런데 n은 1 이상, 25이하인 자연수인데 n%26 = n 아닌가. 문제 개편됐다던데 그래서 그런가.
class Caesar {
    String caesar(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
          char ch = s.charAt(i);
          
          if (Character.isLowerCase(ch)) {
            ch = (char) ((ch - 'a' + n) % 26 + 'a');
          } else if (Character.isUpperCase(ch)) {
            ch = (char) ((ch - 'A' + n) % 26 + 'A');
          }
          result += ch;
        }

        return result;
    }
*/