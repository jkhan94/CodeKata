/*
i~j까지 문자열로 저장해서 "k"가 몇 번 있는지 셈.
*/
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