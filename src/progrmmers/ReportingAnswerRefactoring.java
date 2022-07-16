package progrmmers;
import java.util.*;

public class ReportingAnswerRefactoring {
    /*
    프로그래머스 신고 결과 받기 Map 활용(성공)
     */
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            //   유저 , 신고한 사람 -> HashSet을 통한 중복 신고 제거
            Map<String,HashSet<String>> reportMap = new HashMap<>();
            // 신고자,신고성공메일카운트
            Map<String,Integer> answerMap = new HashMap<>();

            //초기화
            for(int i=0; i<id_list.length; i++){
                HashSet<String> setting = new HashSet<>();
                reportMap.put(id_list[i],setting);
                answerMap.put(id_list[i],0);
            }

            //누가 누구를 신고했는지? 에 대한 세팅
            for(String s : report){
                String[] tmp = s.split(" ");
                String reporting = tmp[0];
                String reported = tmp[1];
                reportMap.get(reported).add(reporting);
            }

            //reportMap 을 통하여 신고메일 세팅
            for(String userId : reportMap.keySet()){
                HashSet<String> id = reportMap.get(userId);
                if(id.size() >= k){
                    for(String answerId : id){
                        answerMap.put(answerId,answerMap.get(answerId)+1);
                    }
                }
            }

            //answerMap을 활용하여 정답 세팅
            for(int i=0; i<id_list.length; i++){
                answer[i] = answerMap.get(id_list[i]);
            }

            return answer;
        }
    }

}
