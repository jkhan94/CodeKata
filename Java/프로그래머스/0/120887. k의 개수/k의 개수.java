/*
i~j까지 문자열로 저장해서 "k"가 몇 번 있는지 셈.
*/
/*
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String temp = "";        
        String kString = Integer.toString(k);
        
        for(int a=i; a<=j; a++){
            temp += Integer.toString(a);
        }
        
        String[] num = temp.split("");
        for(int a=0; a<num.length; a++){
            if(num[a].equals(kString)){
                answer++;
            }
        }
                        
        return answer;
    }
}
*/
class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        // 전체 개수 - k를 제외한 개수
        return str.length() - str.replace(k+"", "").length();
    }
}
/*
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}
*/