class Solution {
    public int[] solution(String myString) {
        String[] my = myString.split("x");
        int len = my.length;
        
        if(myString.endsWith("x")){
            len++;
        }
        
        int[] answer = new int[len];
        
        for(int i=0; i<my.length; i++){
            answer[i] = my[i].length();            
        }
        return answer;
    }
}