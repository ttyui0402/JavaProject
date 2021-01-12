package OOP_Design_pattern.Factory_Method.Computer;

public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer("Apple");
    }
}
