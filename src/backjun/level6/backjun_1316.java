package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int check = 0;
        for (int i = 0; i <len; i++) {
            String str = br.readLine();
            check += groupChecking(str);
        }
        System.out.println(check);
    }

    private static int groupChecking(String str) {
        boolean[] alphabet = new boolean[26];
        int prev = 0;
        int result = 1;
        /**
         * 알파벳이 쓰였는지 확인
         * 쓰인적이 있다면 이전문자와 같은지 확인
         */
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i) - 97;
            if(alphabet[now]){
                if(prev != now){
                    result = 0;
                    break;
                }
            }else{
                alphabet[now] = true;
            }
            prev = now;
        }
        return result;
    }
}
