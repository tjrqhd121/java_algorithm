package codelion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Radius {
    private final static double Pi = 3.141592653589793;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("반지름을 입력하세요 : ");
        double radius = Double.parseDouble(br.readLine());
        double circleArea = radius * radius * Pi;
        System.out.println("반지름의 넓이는 : " + circleArea);
    }
}
