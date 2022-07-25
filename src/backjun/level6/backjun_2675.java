package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun_2675 {
    public static void main(String[] args) throws IOException {
        /*
            첫 입력은 라인개수
            두번째 for 문은 str 길이만큼 돌림
            세번째 for 문은 len 만큼 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputLine = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLine; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(token.nextToken());
            String str = token.nextToken();
            for (int j = 0; j < str.length() ; j++) {
                for(int k = 0; k < len; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
