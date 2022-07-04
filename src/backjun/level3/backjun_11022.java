package backjun.level3;

import java.io.*;
import java.util.StringTokenizer;

public class backjun_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= len; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int first = Integer.parseInt(stringTokenizer.nextToken());
            int second = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write("Case #"+i+": " +
                    first + " + " + second + " = " +
                    String.valueOf(first + second)+"\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
