public class StrangeWords {
    public static void main(String[] args) {
        String s = "try  hello world";
        String answer = "";
        String[] word = s.split("");
        int idx=0;

        for(int i = 0; i < word.length; i++) {
            if(word[i].equals(" ")) {
                idx=0;
            } else if(idx%2==0){
                word[i]=word[i].toUpperCase();
                idx++;
            } else if(idx%2!=0){
                word[i]=word[i].toLowerCase();
                idx++;
            }
            answer+=word[i];
        }

        System.out.println(answer);


    }
}
