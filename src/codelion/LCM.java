package codelion;
public class LCM {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        int tmp = 0;
        gcd(a, b);
        int lcm = gcd(a, b) * a * b;
        System.out.println("찾는정수:" + lcm);
    }
    private static int gcd(int a, int b) {
        int tmp;
        while(b > 0){
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}

//    int answer = 0;
//    for (int i = 1; i <=100; i++) {
//            if(i % 7 == 0 && i % 8 == 0){
//                answer = i;
//                break;
//            }
//    }
//    System.out.println("찾는정수:" + answer);