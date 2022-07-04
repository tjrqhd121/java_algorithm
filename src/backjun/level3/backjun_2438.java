package backjun.level3;

import java.io.*;

public class backjun_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        bufferedReader.close();
    }
}
