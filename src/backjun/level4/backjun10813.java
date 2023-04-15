package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class backjun10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            String[] arr = br.readLine().split(" ");
            int[] intArr = Stream.of(arr).mapToInt(Integer::parseInt).toArray();
            int temp = basket[intArr[0] - 1];
            basket[intArr[0] - 1] = basket[intArr[1] - 1];
            basket[intArr[1] - 1] = temp;
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
