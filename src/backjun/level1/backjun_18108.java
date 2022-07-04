package backjun.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int year = Integer.parseInt(s);
        System.out.println(year - 543);
    }
}
