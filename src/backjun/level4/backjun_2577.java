package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1;
        int[] digitCnt = new int[10];

        for (int i = 0; i < 3; i++) {
            sum *= Integer.parseInt(bufferedReader.readLine());
        }

        while(sum > 0){
            int digits = sum % 10;
            sum /= 10;
            digitCnt[digits] +=1;
        }

        for (int i = 0; i < digitCnt.length; i++) {
            System.out.println(digitCnt[i]);
        }
    }
}
