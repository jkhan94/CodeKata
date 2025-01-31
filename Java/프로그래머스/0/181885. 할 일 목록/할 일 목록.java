class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str = "";
        for(int i=0; i<finished.length; i++){
            str = finished[i]==false ? str+todo_list[i]+"," : str;
        }

        return str.split(",");
    }
}
/*
import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        
        // 리스트명.toArray(반환할 배열 타입 지정);
        // list.toArray(new String[0])
        return answer.toArray(String[]::new); // 자바11 이상
    }
}
*/