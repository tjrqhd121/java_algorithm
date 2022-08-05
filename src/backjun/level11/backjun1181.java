package backjun.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class backjun1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] array = new String[len];
        for (int i = 0; i < len; i++) {
            array[i] = br.readLine();
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2); // 사전 순
                } else {
                    return o1.length() - o2.length(); // 길이 순
                }
            }
        });

        System.out.println(array[0]);
        for (int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i -1])){
                System.out.println(array[i]);
            }
        }
    }
}
