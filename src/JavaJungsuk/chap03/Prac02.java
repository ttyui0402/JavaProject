package JavaJungsuk.chap03;

public class Prac02 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크
        int numOfBucket = (numOfApples % sizeOfBucket > 0 ? 1 : 0) + (numOfApples / sizeOfBucket);

        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }
}
