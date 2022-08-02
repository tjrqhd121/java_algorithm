package backjun.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class backjun2751 {
    public static void main(String[] args) throws IOException {
        /**
         * 2750 과의 차이점
         * 시간복잡도가 o(nlogn) 경우가 출제된다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            array.add(Integer.parseInt(br.readLine()));
        }

        /**
         * Arrays.sort(array)의 시간 복잡도는 o(nlogn) ~ o(n^2) 까지이다.
         * 이 경우에 시간 복잡도 문제를 해결 할 수 없다.
         * 밑의 코드는 반복합병 및 삽입 알고리즘을 사용하여 시간복잡도를 o(n) ~ o(nlogn) 까지 보장한다.
         */
        Collections.sort(array);


        /**
         * 또한 이전의 코드와 같이 System.out.println(i);
         * 로 하나하나 찍을 시 시간초과가 나게된다
         * 이를 예방하기 위하여 StringBuilder 라는 메소드를 사용하여
         * 한번에 묶어서 출력하게된다.
         */
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
