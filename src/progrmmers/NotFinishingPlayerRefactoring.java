package progrmmers;
import java.util.*;

public class NotFinishingPlayerRefactoring {
    //완주하지 못한 선수 map 활용
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String,Integer> map = new HashMap<>();
            for(String player : participant){
                map.put(player,map.getOrDefault(player,0)+1);
            }
            for(String finish : completion){
                map.put(finish, map.get(finish) -1);
            }

            for (String s : map.keySet()) {
                if(map.get(s) > 0){
                    answer = s;
                }
            }

            return answer;
        }
    }

}
