package codelion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Greedy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("금액을 넣으세요:");
        int money = Integer.parseInt(br.readLine());
        int[] changeMoneyList = {50000,10000,5000,1000,500,100,50,10};
        for (int changeMoney : changeMoneyList) {
            System.out.println(changeMoney + "원" + (money / changeMoney + "개"));
            money %= changeMoney;
        }
    }
}
