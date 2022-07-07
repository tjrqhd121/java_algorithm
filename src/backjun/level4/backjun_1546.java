package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backjun_1546 {
    public static void main(String[] args) throws IOException{
        Solution();
    }
    private static void Solution() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bufferedReader.readLine());
        double[] finalExam = new double[len];
        StringTokenizer token = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < len; i++) {
            finalExam[i] = Integer.parseInt(token.nextToken());
        }
        double avg = ChangingAverage(finalExam);

        System.out.println(avg);
    }
    private static double ChangingAverage(double[] array){
        Arrays.sort(array);
        double max = array[array.length - 1];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += (array[i]  / max) * 100;
        }
        double average = sum / array.length;
        return average;
    }
}
