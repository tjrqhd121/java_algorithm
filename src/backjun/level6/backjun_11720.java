package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int sum = 0;
        char[] num = br.readLine().toCharArray();
        for (int i = 0; i < len; i++) {
            sum += (num[i] - '0');
        }
        System.out.println(sum);
    }
}
