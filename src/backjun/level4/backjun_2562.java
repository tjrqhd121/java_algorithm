package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if(number > max){
                max = number;
                idx = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
