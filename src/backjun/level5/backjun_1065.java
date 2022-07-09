package backjun.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = HanSu(Integer.parseInt(br.readLine()));
        System.out.println(answer);
    }

    private static int HanSu(int n) {
        int cnt = 0;
        if(n < 100){
            cnt = n;
        }else{
            cnt = 99;
            for(int i=100; i<=n; i++){
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if(b - a == c - b){
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
