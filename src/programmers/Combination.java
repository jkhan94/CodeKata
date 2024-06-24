package programmers;

public class Combination {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        int answer = 0;

        for(int i=0;i<number.length-2;i++){
            for(int j=i+1;j<number.length-1;j++){
                for(int k=j+1; k<number.length;k++){
                    System.out.print(i+" ");
                    System.out.print(j+" ");
                    System.out.print(k+" ");
                    System.out.print(number[i]+" +");
                    System.out.print(number[j]+" +");
                    System.out.print(number[k]+" = ");
                    System.out.println(number[i]+number[j]+number[k]);
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
    }
}
