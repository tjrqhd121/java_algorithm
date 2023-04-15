package backjun.level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backjun5597 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 30; i++) {
            arr.add(i);
        }
        for (int i = 0; i < 28; i++) {
            arr.remove(Integer.valueOf(sc.nextInt()));
        }
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
