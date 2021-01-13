package chap05;

import java.util.Scanner;

public class Prac13 {
    public static void main(String[] args) {

        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            // char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
            // 배열의 요소를 섞는다.
            for (int j = 0; j < question.length; j++) {
                int a = (int) (Math.random() * question.length);

                char tmp = question[i];
                question[i] = question[a];
                question[a] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String((question)));

            String answer = sc.nextLine();

            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교.
            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.print("틀렸습니다.%n%n");
        }
    }   // main
}
