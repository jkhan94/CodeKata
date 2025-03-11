class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        s = s.toLowerCase();
        p = s.length() - s.replaceAll("p","").length();
        y = s.length() - s.replaceAll("y","").length();
        
        if(p != y){
            answer = false;
        }
                    
        return answer;
    }
}