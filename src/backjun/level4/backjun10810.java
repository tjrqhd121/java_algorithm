package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class backjun10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] answer = new int[N];
        List<String> input = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            input.add(br.readLine());
        }

        for (String s : input) {
            String[] arr = s.split(" ");
            int[] intArr = Stream.of(arr).mapToInt(Integer::parseInt).toArray();
            for (int i = intArr[0] - 1; i <=intArr[1] - 1; i++) {
                answer[i] = intArr[2];
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
