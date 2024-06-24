package programmers;

public class CardPile {
    // goal에 있는 단어가 card1,2에 있는지 순서대로 확인
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want","to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
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

        System.out.println(answer);

    }
}
