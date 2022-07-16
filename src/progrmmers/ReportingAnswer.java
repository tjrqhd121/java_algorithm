package progrmmers;
import java.util.*;

public class ReportingAnswer {
    /*
    프로그래머스 신고 결과 받기(시간 초과)
     */
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            String reporter,reported;

            //신고당한횟수
            int[] reportedCnt = new int[id_list.length];

            //report 중복제거
            HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
            String[] distinctReport = hashSet.toArray(new String[0]);

            //초기값 설정
            Arrays.fill(reportedCnt,0);

            for(int i=0; i<distinctReport.length; i ++){
                //신고자, 당한자
                reporter = distinctReport[i].split(" ")[0];
                reported = distinctReport[i].split(" ")[1];

                for(int j=0, leng=id_list.length; j<leng; j++){
                    if(reported.equals(id_list[j])){
                        reportedCnt[j]++;
                        break;
                    }
                }
            }

            //신고메일
            for(int i=0, leng=reportedCnt.length; i<leng; i++){
                if(k <= reportedCnt[i]){
                    for(int j=0; j<distinctReport.length; j++){
                        reporter = distinctReport[j].split(" ")[0];
                        reported = distinctReport[j].split(" ")[1];
                        if(reported.equals(id_list[i])){
                            for(int t=0; t<id_list.length; t++){
                                if(reporter.equals(id_list[t])){
                                    answer[t]++;
                                }
                            }
                        }
                    }
                }
            }

            return answer;
        }
    }

}
