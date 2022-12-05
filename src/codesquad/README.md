# 구현과정 상세 설명

## 1단계 : 콘솔로 원 그리기

- 기능분석
    - [X] 크기를 입력받는다
        - [X] 예외발생 시 재입력 받는다
    - [X] 입력된 숫자를 활용하여 원을 그린다
        - [X] 입력값이 짝수일 시 그에따른 원을 그린다
        - [X] 입력값이 홀수일 시 그에따른 원을 그린다
    - [X] 원을 출력한다

- 예외사항
    - [X] 공백 없는 숫자만 기입가능하다
    - [X] 크기는 1 이상 80 이하이다


원을 그리는 방법

```
  2차원 배열을 이용하여 원을 그린다
  입력값이 홀수인지 짝수인지에 따른 그려지는 원이 다르다
  
  ex) 입력값이 3일 때
  
  ㅁ = 공백
  
  ㅁ--ㅁ       --
  -ㅁㅁ-  --> -  -
  ㅁ--ㅁ       --
  array[x][y + 1]    // array[3][3 + 1]
  
  | x |   y  |
  |---|------|
  | 0 | 1, 2 |
  | 1 | 0, 3 |
  | 2 | 1, 2 |
  
  - x는 1씩 증가한다(for문)
  - y0 + y1 = 입력값(3)    // 서로 대칭되어 그림이 그려진다
  - x < (입력값 /2) -> y = (입력값 /2) - x
  - x >= (입력값 /2) -> y = x - (입력값 /2)
  
  입력값이 4일 때
  
  ㅁ--ㅁ       --
  -ㅁㅁ-      -  -
  -ㅁㅁ-  --> -  -
  ㅁ--ㅁ       --
  array[x][y] -> array[4][4]
  
  | x |   y  |
  |---|------|
  | 0 | 1, 2 |
  | 1 | 0, 3 |
  | 2 | 0, 3 |
  | 3 | 1, 2 |
  
  - x는 1씩 증가한다(for문)
  - y0 + y1 = 입력값(4)     // 서로 대칭되어 그림이 그려진다
  - x < (입력값 /2) -> y = (입력값 /2) - 1 - x    // -1 을 하는 이유는 컴퓨터는 0 부터 시작하기 때문
  - x >= (입력값 /2) -> y = x - (입력값 /2)
  
```

- 실행 코드
```java
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
```

- 실행 결과

```
원의 크기는?
5
  --
 -  -
-    -
 -  -
  --
  
```