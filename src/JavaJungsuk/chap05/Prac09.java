package chap05;

public class Prac09 {
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' ' },
                {'*', '*', ' ', ' ', ' ' },
                {'*', '*', '*', '*', '*' },
                {'*', '*', '*', '*', '*' }
        };

        // 원하는 모양의 배열이 출력되도록 새로운 배열을 생성해야 한다.
        // 5행 4열의 배열을 생성.
        char[][] result = new char[star[0].length][star.length];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {

                int a = j;
                int b = star.length -1 -i;

                result[a][b] = star[i][j];

            }

        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }   // main
} // class
