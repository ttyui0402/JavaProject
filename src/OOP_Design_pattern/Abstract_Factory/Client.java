package OOP_Design_pattern.Abstract_Factory;

public class Client {
    public static void main(String[] args) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("Apple");
    }
}
