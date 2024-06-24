package programmers;

public class Babbling {
    public static void main(String[] args) {
        String[] babbling ={"aya", "yee", "u", "maa"};
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        String[] words = {"ayaaya", "yeye", "woowoo", "mama"};
        String temp="";

        for(int i=0; i<babbling.length;i++){
            if(babbling[i].contains(words[0])
                    || babbling[i].contains(words[1])
                    || babbling[i].contains(words[2])
                    || babbling[i].contains(words[3])){
                continue;
            }


            temp=babbling[i];

            temp = temp.replace(word[0],"");
            temp = temp.replace(word[1],"");
            temp = temp.replace(word[2],"");
            temp = temp.replace(word[3],"");

            if(temp.length() == 0){
                answer++;
            }
        }
    }
}
