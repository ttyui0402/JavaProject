package OOP_Design_pattern.Abstract_Factory;

public class FactoryOfComputerFactory {
    public void createComputer(String type) {
        ComputerFactory computerFactory = null;

        switch (type) {
            case "Apple" -> {
                computerFactory = new AppleComputerFactory();
            }

            case "Samsung" -> {
                computerFactory = new SamsungComputerFactory();
            }
        }
        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
