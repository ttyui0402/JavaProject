package OOP_Design_pattern.Abstract_Factory;

public class SamsungComputerFactory implements ComputerFactory {
    public SamsungKeyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    public SamsungMouse createMouse() {
        return new SamsungMouse();
    }

}
