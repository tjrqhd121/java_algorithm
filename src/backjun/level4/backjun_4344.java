package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        for (int i = 0; i < len; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int[] score = new int[Integer.parseInt(token.nextToken())];
            int sum = 0;

            for (int j = 0; j < score.length; j++) {
                score[j] = Integer.parseInt(token.nextToken());
                sum += score[j];
            }

            double avg = sum / (double)score.length;
            int avgStudent = 0;

            for(int k =0; k < score.length; k++) {
                if(score[k] > avg){
                    avgStudent++;
                }
            }

            double num = avgStudent/(double)score.length * 100;
            String result = String.format("%.3f", num);
            System.out.println(result+"%");
        }
    }
}
