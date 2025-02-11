/*
split(구분기호, 배열 길이)
*/
class Solution {
    public int[] solution(String myString) {
        String[] my = myString.split("x",myString.length());       
        int[] answer = new int[my.length];
        
        for(int i=0; i<my.length; i++){
            answer[i] = my[i].length();            
        }
        return answer;
    }
}