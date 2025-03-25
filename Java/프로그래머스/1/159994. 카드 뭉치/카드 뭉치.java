// goal에 있는 단어가 card1,2에 있는지 순서대로 확인
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
       String answer = "";
        
       int card1Index=0, card2Index=0, count=0;

       for (int i = 0; i < goal.length; i++) {
            if(card1Index<cards1.length && goal[i].equals(cards1[card1Index])){
                card1Index++;
                count++;
                continue;
            }
            if( card2Index<cards2.length && goal[i].equals(cards2[card2Index])){
                card2Index++;
                count++;
                continue;
            }
        }

        if(count==goal.length){
            answer="Yes";
        } else {
            answer = "No";
        }
        
        return answer;
    }
}
/*
import java.io.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        for(int i=0; i<goal.length; i++){
            String target = goal[i];

            if(cardIdx1 < cards1.length && target.equals(cards1[cardIdx1])){
                cardIdx1 ++;
            }
            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2])){
                cardIdx2++;
            }
            else{
                return "No";
            }
        }

        return "Yes";
    }
}
*/