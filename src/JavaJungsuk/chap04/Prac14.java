import java.util.Scanner;

public class Prac14 {
    public static void main(String[] args) {
        // 1~100사이의 임의이ㅡ 값을 얻어서 answer에 저장한다.

        int answer = (int)((Math.random() * 100) + 1);
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = sc.nextInt();

            if (input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 " + count + "번 입니다.");
                break;
            }

        } while (true);
    }
}
