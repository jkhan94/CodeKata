class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}
/*
import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] my = my_string.split(" ");
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0; i<my.length; i++){
            if(!my[i].equals("")){
                answer.add(my[i]);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
*/