package backjun.level2;

import java.io.*;
import java.util.StringTokenizer;

public class backjun_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int hour = Integer.parseInt(stringTokenizer.nextToken());
        int minute = Integer.parseInt(stringTokenizer.nextToken());
        int timer = Integer.parseInt(bufferedReader.readLine());
        if(minute + timer >= 60) {
            hour = (hour + (minute + timer) / 60) % 24;
            minute = (minute + timer) % 60;
            bufferedWriter.write(hour + " " + minute);
        }else {
            minute += timer;
            bufferedWriter.write(hour + " " + minute);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
