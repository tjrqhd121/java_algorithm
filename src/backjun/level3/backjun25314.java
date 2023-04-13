package backjun.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < num/4; i++) {
            answer.append("long ");
        }
        answer.append("int");
        System.out.println(answer.toString());
    }
}
