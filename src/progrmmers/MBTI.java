package progrmmers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MBTI {
    public static void main(String[] args) {
        String[] survey = {"TR","RT","TR"};
        int[] choices = {7,1,3};
        System.out.println(solutions(survey,choices));
    }

    private static String solutions(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        /**
         * 순서가 중요하다.
         * [R T]
         * [C F]
         * [J M]
         * [A N]
         */
        String[] mbti = {"R","T","C","F","J","M","A","N"};
        Map<String,Integer> map = new HashMap<>();
        int len = survey.length;

        //map 초기화
        for (int i = 0; i < mbti.length; i++) {
            map.put(mbti[i],0);
        }

        for (int i = 0; i < len; i++) {
            String[] type = survey[i].split("");
            //4 보다 클 시 1 2 3 순으로 점수가 책정
            if(choices[i] > 4){
                map.put(type[1],map.get(type[1]) + choices[i] - 4);
            //4 보다 작을 시 3 2 1 순으로 점수가 책정
            }else if (choices[i] < 4) {
                map.put(type[0], map.get(type[0]) + 4 - choices[i]);
            //4 일 시 점수 증가 x
            } else {
                continue;
            }
        }
        System.out.println(map);

        for (int i = 0; i < mbti.length; i = i + 2) {
            //값을 순서대로 비교 하여 값을 append 시킨다.
            if(map.get(mbti[i]) > map.get(mbti[i+1])){
                sb.append(mbti[i]);
            }else if(map.get(mbti[i]) < map.get(mbti[i+1])){
                sb.append(mbti[i+1]);
            //점수 값이 같을 시 사전순 으로 append 시킨다.
            }else{
                if(mbti[i].compareTo(mbti[i+1]) < 0){
                    sb.append(mbti[i]);
                }else {
                    sb.append(mbti[i+1]);
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}
