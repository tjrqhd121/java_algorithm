package backjun.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_1110 {

    public static int CycleNumber(int num){
        int cycleNum = num;
        int cnt = 0;
        do {
            int tens = cycleNum / 10;
            int units = cycleNum % 10;
            int sum = tens + units;
            if(sum < 10) {
                cycleNum = (units * 10) + sum;
            } else {
                cycleNum = (units * 10) + (sum % 10);
            }
            cnt++;
        } while (!(cycleNum == num));
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        System.out.println(CycleNumber(num));
    }
}
