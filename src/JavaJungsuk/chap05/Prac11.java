package chap05;

public class Prac11 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        // 가로와 세로가 1씩 더 큰 배열을 생성.
        int[][] result = new int[score.length + 1][score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                // 일단, 배열 score가 result에 들어가야 한다.
                result[i][j] = score[i][j];
                // 각 행의 총합을 각 행의 가장 우측에 저장해야 한다.
//                result[i][3] += result[i][j];
                result[i][score[0].length] += result[i][j];
                // 각 열의 총합을 각 열의 가장 하단에 저장해야 한다.
//                result[5][j] += result[i][j];
                result[score.length][j] += result[i][j];
                // 배열의 가장 우측하단에는 마지막 행과 열들의 총합을 저장해야 한다.
//                result[5][3] += result[i][j];
                result[score.length][score[0].length] += result[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
