package backjun.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int hive = 1;
        int count = 1;
        while(i > hive) {
            hive += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}
