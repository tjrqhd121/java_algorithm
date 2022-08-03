package backjun.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class backjun1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int su = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();
        while(su > 0){
            int units = su % 10;
            answer.add(units);
            su = su / 10;
        }
        Collections.sort(answer);
        Collections.reverse(answer);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : answer) {
            sb.append(integer);
        }
        System.out.println(sb);
    }
}
