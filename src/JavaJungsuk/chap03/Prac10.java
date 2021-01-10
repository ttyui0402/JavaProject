package JavaJungsuk.chap03;

public class Prac10 {
    public static void main(String[] args) {
        // lowerCase의 빈 곳을 채워 넣어라.

        char ch = 'F';

        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;

        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase : " + lowerCase);

    }
}
