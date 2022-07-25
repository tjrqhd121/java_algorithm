package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_5622 {
    public static void main(String[] args) throws IOException {
        solutions();
    }

    private static void solutions() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dial = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int second = 3;
        int result = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < dial.length; j++) {
                if(dial[j].contains(String.valueOf(str.charAt(i)))){
                    result += j + second;
                }
            }
        }
        System.out.println(result);
    }
}
