package backjun.level3;

import java.io.*;
import java.util.StringTokenizer;

public class backjun_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer input = new StringTokenizer(bufferedReader.readLine());
        String result = "";
        int N = Integer.parseInt(input.nextToken());
        int X = Integer.parseInt(input.nextToken());
        input = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            int sequnce = Integer.parseInt(input.nextToken());
            if(sequnce < X){
                result += String.valueOf(sequnce)+" ";
            }
        }
        bufferedWriter.write(result);
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
