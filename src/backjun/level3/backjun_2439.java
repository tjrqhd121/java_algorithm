package backjun.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= 0; j--) {
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        bufferedReader.close();
    }
}
