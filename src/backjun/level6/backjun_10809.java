package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class backjun_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // <알파벳소문자, -1> 초기화
        Map<String, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < 26 ; i++) {
            String s = Character.toString('a' + i);
            alphabet.put(s,-1);
        }

        //alphabet 입력
        String[] str = br.readLine().split("");

        //* if(첫 단어 조우 시 위치 저장)
        for (int i = 0; i < str.length; i++) {
            if(alphabet.get(str[i]) == -1){
                alphabet.put(str[i], i);
            }
        }

        for (String s : alphabet.keySet()) {
            System.out.print(alphabet.get(s) + " ");
        }
    }
}
