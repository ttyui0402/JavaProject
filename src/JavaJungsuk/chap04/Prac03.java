package JavaJungsuk.chap04;

public class Prac03 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            total += sum;
        }
        System.out.println("sum : " + sum);
        System.out.println("total : " + total);
    }
}
