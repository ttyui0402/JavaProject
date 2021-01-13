package chap05;

public class Prac06 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money : " + money);

        int a = 0;
        int b = 0;
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + " 원: " + money / coinUnit[i] + "개");
            money = money % coinUnit[i];
        }
    } // main
}
