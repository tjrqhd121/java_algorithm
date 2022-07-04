package backjun.level3;

import java.io.*;
import java.util.StringTokenizer;

public class backjun_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String str;
        while ((str = bufferedReader.readLine()) != null){
            StringTokenizer stringTokenizer = new StringTokenizer(str);

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(a + b +"\n");
        }
        System.out.print(stringBuilder);
    }
}
