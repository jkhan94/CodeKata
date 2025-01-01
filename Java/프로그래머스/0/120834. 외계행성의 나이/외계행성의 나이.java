class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ages = new char[26];
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