package progrmmers;
import java.util.*;
public class PhoneBookPrefix {
    public static void main(String[] args) {
/**
 * String 에 숫자를 sort 시 아스키코드 값으로 하나하나 비교하여 정렬한다.
 * 결과적으로 문자열의 순서와 일치하게 문자열 안에서 숫자의 순서는,
 * 비교를 시작할때 첫 자리수가 더 큰 알파벳(숫자) 가 크면 이후 자릿수와 무관하게 무조건 더 크다.
 * 앞 자릿수의 알파벳(or 숫자) 가 같으면서 자릿수만 다르면 자릿수가 큰 숫자가 더 크다.
 */
        String[] phone_book = {"a12","b102","2b1","1a00004","123","4123"};
        boolean answer = true;
        Arrays.sort(phone_book);
        for (String s : phone_book) {
            System.out.println("s = " + s);
        }

        for(int i=0; i<phone_book.length - 1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
            }
        }

    }
}