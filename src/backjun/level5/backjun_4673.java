package backjun.level5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class backjun_4673 {

    //1. 공식 : int su -> su 분해하여 su + s + u = return;
    //2. 중복제거 담기
    //3. 비교하면서 담겨있지 않은 수 출력.
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= 10000; i++) {
            hashSet.add(SelfNum(i));
        }

        for (int i = 1; i <10000 ; i++) {
            if(!hashSet.contains(i)){
                System.out.println(i);
            }
        }
    }

    private static int SelfNum(int n) {
        List<Integer> list = new ArrayList<>();
        int splitNum = n;
        int sum = 0;
        while (splitNum > 0){
            list.add(splitNum % 10);
            splitNum /= 10;
        }
        for (Integer num : list) {
            sum +=num;
        }
        int result = n + sum;
        return result;
    }
}
