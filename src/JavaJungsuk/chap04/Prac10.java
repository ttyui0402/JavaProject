package JavaJungsuk.chap04;

public class Prac10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        // 반복문 사용해야 함.

        while (num > 0) {
            // 나머지 값을 계속 더해줘야 한다.
            sum += num % 10;
            // 숫자를 끝에서 한자리씩 잘라야 한다.
            num /= 10;
        }
        System.out.println("sum : " + sum);
    }
}
