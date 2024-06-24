import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberPair {
    public static void main(String[] args) {
        String X = "100";
        String Y = "245";

        String answer = "";
        int[] xCount= new int[10];
        int[] yCount= new int[10];
        StringBuilder ans = new StringBuilder();

        // X의 숫자 개수
        for(String x : X.split("")){
            xCount[Integer.parseInt(x)]++;
        }

        // Y의 숫자 개수
        for(String y : Y.split("")){
            yCount[Integer.parseInt(y)]++;
        }

        // 숫자 개수가 1개 이상일 때 역순정렬
        for(int i=9; i>=0;i--){
            if(xCount[i]>0 && yCount[i]>0){
                for(int j=0; j<Math.min(xCount[i],yCount[i]);j++){
                    ans.append(i);
                }
            }
        }

        answer = ans.toString();

        if(answer.equals("")){
            answer="-1";
        } else if(answer.startsWith("0")){
            answer = "0";
        }

        System.out.println(answer);
    }
}
