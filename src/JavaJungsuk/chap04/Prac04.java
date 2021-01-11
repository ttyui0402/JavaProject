package JavaJungsuk.chap04;

public class Prac04 {
    public static void main(String[] args) {
        // 짝수일 경우에만 - 붙여야 한다.

        int num = 0;
        int sum = 0;
        int opt = 1;

        for (int i = 1; true; i++, opt = -opt) {
            num = i * opt;
            sum += num;

            if (sum >= 100) {
                break;
            }
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
    }
}
