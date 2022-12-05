package codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Quest1 {

    public static final int MIN_SIZE = 1;
    public static final int MAX_SIZE = 80;
    public static final String NUMBER_REGEX = "^\\d*$";
    public static final char PAINT = '-';
    public static final char BLANK = ' ';
    public static final String SIZE_ERROR_MESSAGE = "1 이상 80 이하의 정수를 입력하여 주십시오.";
    public static final String NOT_NUMBER_MESSAGE = "숫자를 공백 없이 입력하여 주십시오.";
    public static final String INPUT_MESSAGE = "원의 크기는?";


    public static void main(String[] args) throws IOException {
        run();
    }

    private static void run() throws IOException {
        System.out.println(INPUT_MESSAGE);
        int size = readSize();
        char[][] circle = makeCircle(size);
        printCircle(circle);
    }

    /**
     * 입력값을 반환하는 메서드
     * 예외발생 시 다시 입력한다
     */
    private static int readSize() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            validate(input);
            return Integer.parseInt(input);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return readSize();
        }
    }

    /**
     * 예외사항을 검증한다
     * 숫자인지, 범위가 맞는지
     */
    private static void validate(String input) {
        isNumber(input);
        isRange(input);
    }

    /**
     * 숫자인지 확인
     */
    private static void isNumber(String input) {
        if(!Pattern.matches(NUMBER_REGEX, input)) {
            throw new IllegalArgumentException(NOT_NUMBER_MESSAGE);
        }
    }

    /**
     * 입력 범위 확인
     */
    private static void isRange(String input) {
        int size = Integer.parseInt(input);

        if(size < MIN_SIZE || size > MAX_SIZE) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }
    }

    /**
     * 원을 담는 배열 생성
     */
    private static char[][] makeCircle(int size) {
        if(size % 2 == 0) {
            return drawEvenCircle(size);
        }
        return drawOddCircle(size);
    }

    /**
     * 입력 값이 짝수일 시 원을 생성하는 메서드
     */
    private static char[][] drawEvenCircle(int size) {
        char[][] circle = new char[size][size];
        for (int x = 0; x < size; x++) {
            int y = drawEvenPoint(size, x);
            circle[x][y] = PAINT;
            circle[x][size - 1 - y] = PAINT;
        }
        return circle;
    }

    /**
     * 원이 그려져야 하는 부분의 y값을 반환한다
     */
    private static int drawEvenPoint(int size, int x) {
        if (x < (size / 2)) {
            return (size / 2) - 1 - x;
        }
        return x - (size / 2);
    }

    /**
     * 입력 값이 홀수일 시 원을 생성하는 메서드
     */
    private static char[][] drawOddCircle(int size) {
        char[][] circle = new char[size][size + 1];
        for (int x = 0; x < size; x++) {
            int y = drawOddPoint(size, x);
            circle[x][y] = PAINT;
            circle[x][size - y] = PAINT;
        }
        return circle;
    }

    /**
     * 원이 그려져야 하는 부분의 y값을 반환한다
     */
    private static int drawOddPoint(int size, int x) {
        if(x < (size / 2)){
            return (size / 2) - x;
        }
        return x - (size / 2);
    }

    /**
     * 원을 그려주는 메서드
     */
    private static void printCircle(char[][] circle) {
        for (char[] chars : circle) {
            for (char ink : chars) {
                System.out.println(print(ink));
            }
            System.out.println();
        }
    }

    /**
     * 배열에 담겨진 값을 반환한다
     */
    private static char print(char ink) {
        if (ink == 0) {
            return BLANK;
        }
        return ink;
    }
}
