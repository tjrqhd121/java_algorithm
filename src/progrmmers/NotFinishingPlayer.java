package progrmmers;
import java.util.Arrays;

public class NotFinishingPlayer {
    //완주하지 못한 선수
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Arrays.sort(participant);
            Arrays.sort(completion);

            for(int i=0; i<completion.length; i++){
                if(!participant[i].equals(completion[i])){
                    answer = participant[i];
                    return answer;
                }
            }
            answer = participant[completion.length];
            return answer;
        }
    }

}
