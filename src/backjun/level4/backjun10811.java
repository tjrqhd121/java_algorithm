package backjun.level4;

import java.util.Scanner;

public class backjun10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<M; i++){
            int I = sc.nextInt() - 1;
            int J = sc.nextInt() - 1;

            while(I<=J){
                int temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;
                I++;
                J--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
