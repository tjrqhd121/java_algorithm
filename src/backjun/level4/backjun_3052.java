package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class backjun_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(bufferedReader.readLine()) % 42;
            idx.add(num);
        }
        HashSet<Integer> distinctData = new HashSet<>(idx);
        List<Integer> distinctIdx = new ArrayList<>(distinctData);
        System.out.println(distinctIdx.size());
    }

}
