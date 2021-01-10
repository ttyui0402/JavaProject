package JavaJungsuk.chap03;

public class Prac06 {
    public static void main(String[] args) {
        // 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드를 작성하라.
        int num = 52;
        System.out.println(Math.round((num / 10 + 1) * 10) % num);
        System.out.println(10 - num % 10);
    }
}
