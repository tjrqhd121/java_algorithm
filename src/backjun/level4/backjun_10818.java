package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backjun_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bufferedReader.readLine());
        int[] number = new int[len];
        StringTokenizer input = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            number[i] = Integer.parseInt(input.nextToken());
        }

        Arrays.sort(number);
        System.out.println(number[0] + " " + number[len - 1]);
    }
}
