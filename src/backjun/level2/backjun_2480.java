package backjun.level2;

import java.io.*;
import java.util.StringTokenizer;

public class backjun_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int first = Integer.parseInt(stringTokenizer.nextToken());
        int second = Integer.parseInt(stringTokenizer.nextToken());
        int third = Integer.parseInt(stringTokenizer.nextToken());

        if(first == second && second == third){
            bufferedWriter.write(String.valueOf(10000 + (first * 1000)));
        }else if(first == second || first == third){
            bufferedWriter.write(String.valueOf(1000 + (first * 100)));
        }else if(second == third){
            bufferedWriter.write(String.valueOf(1000 + (second * 100)));
        }else{
            int max = Math.max(first,Math.max(second,third));
            bufferedWriter.write(String.valueOf(max * 100));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
