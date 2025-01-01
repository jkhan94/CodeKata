class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ages = new char[10]; // 숫자는 0-9까지
        int ten = 10;
        
        for(int i = 0; i<ages.length; i++){
            ages[i] = (char)(97+i);
        }

        while(age>0){
            answer = ages[age%ten] + answer;
            age /= ten;
        }        
        return answer;
    }
}