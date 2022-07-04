package backjun.level3;

import java.io.*;
import java.util.StringTokenizer;

public class backjun_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer input = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(input.nextToken());
            int b = Integer.parseInt(input.nextToken());

            if(a == b && a == 0){
                break;
            }else {
                bufferedWriter.write(String.valueOf(a + b)+"\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
