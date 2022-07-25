package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");

        num = reverse(num);
        System.out.println(Math.max(Integer.parseInt(num[0]), Integer.parseInt(num[1])));
    }

    private static String[] reverse(String[] num) {
        for (int i = 0; i < num.length; i++) {
            int x = Integer.parseInt(num[i]);
            int result = 0;
            while(x > 0){
                result = result * 10 + x % 10;
                x = x / 10;
            }
            num[i] = String.valueOf(result);
        }
        return num;
    }
}
