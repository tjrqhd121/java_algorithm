package progrmmers;
import java.util.*;

public class NoSameNumber {

    public class Solution {
        public int[] solution(int []arr) {
            List<Integer> list = new ArrayList<>();
            int len = arr.length;
            int temp = -1;
            for(int i = 0; i < len - 1; i++){
                if(temp != arr[i]){
                    list.add(arr[i]);
                }
                temp = arr[i];
            }

            int[] answer = list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
            return answer;
        }
    }

}
