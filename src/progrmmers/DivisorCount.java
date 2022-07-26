package progrmmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DivisorCount {
    public static void main(String[] args) {
        int left = 24;
        int right = 27;
        //  주어진 수 , 약수(중복제거)
        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        int result = 0;

        // i = 주어진 수를 순환
        for (int i = left; i <= right; i++) {
            int sqrt = (int)Math.sqrt(i);
            HashSet<Integer> hash = new HashSet<>();
            //1 ~ i의 제곱근 까지 돌며 약수를 구한다
            for(int j = 1; j <= sqrt; j++){
                if( i % j == 0){
                    hash.add(j); //약수의 작은 수
                    hash.add(i/j); //약수의 큰 수
                }
            }

            map.put(i,hash);
        }
        //약수의 개수가 짝수인지 홀수인지 구분
        for (Integer i : map.keySet()) {
            int count = map.get(i).size();
            if(count % 2 == 0){
                result += i; // 짝수 +
            }else{
                result -= i; // 홀수 -
            }
        }
        System.out.println("result = " + result);
    }
}
