package progrmmers;

import java.util.Arrays;

public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            // 예산을 넘길 때
            if(sum > budget){
                answer = i;
                break;
            //예산이 딱 떨어질 때
            }else if(sum == budget){
                answer = i + 1;
                break;
            //예산이 남을 때
            }else{
                answer = d.length;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
            int[] d = {1,3,2,5,4};
            int budget = 9;
        System.out.println(solution(d,budget));
    }
}

