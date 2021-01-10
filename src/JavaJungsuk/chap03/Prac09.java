package JavaJungsuk.chap03;

public class Prac09 {
    public static void main(String[] args) {
        // 문자형 변수 ch가 영문자(대문자 또는 소문자) 이거나 0 ~ 9 사이의 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드를 작성하라.

        char ch = 2;
        boolean b = 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z' || 0 <= ch && ch <= 9;

        System.out.println("b : " + b);
    }
}
