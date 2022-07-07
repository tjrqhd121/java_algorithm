package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            String ox = bufferedReader.readLine();
            String[] array = ox.split("");
            System.out.println(CheckOX(array));
        }

    }

    private static int CheckOX(String[] str) {
        int score = 0;
        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].toLowerCase().equals("o")){
                answer++;
            }else if(str[i].toLowerCase().equals("x")){
                answer = 0;
            }
            score += answer;
        }
        return score;
    }
}
