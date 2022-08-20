package progrmmers;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopment {
    public static void main(String[] args){
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        solutions(progresses,speeds);
    }

    private static void solutions(int[] progresses, int[] speeds) {
        int len = progresses.length;
        int[] list = new int[len];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            //progresses 의 배포기간 추출
            list[i] = release(progresses[i],speeds[i]);
            System.out.println("list = " + list[i]);
        }
        //배포일을 비교
        for (int i = 0; i < len; i++) {
            //workCount 작업 개수
            int workCount = 1;
            //배포일이 겹쳐 같이 배포된 경우가 아닐 시
            //조건 상 배포일은 0일이 될 수 없다.
            if(list[i] != 0) {
                for (int j = i + 1; j < len; j++) {
                    //배포일이 겹치거나 뒤의 작업들이 먼저 끝날 시 같이 배포한다.
                    if (list[i] >= list[j]) {
                        list[j] = 0;
                        workCount++;
                    } else {
                        break;
                    }
                }
            // 나중 배포일이 이전 배포일보다 빠를 때
            } else {
                workCount = 0;
            }

            System.out.println("workCount = " + workCount);
            if(workCount > 0) {
                answer.add(workCount);
            }
        }
    }

    //배포일자 계산
    private static int release(int a, int b) {
        int releaseDay = 0;
        //100% 가 될 때 까지
        while(a < 100){
            a += b;
            releaseDay++;
        }
        return releaseDay;
    }
}
