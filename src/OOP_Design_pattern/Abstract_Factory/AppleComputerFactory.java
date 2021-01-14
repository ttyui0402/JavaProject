package OOP_Design_pattern.Abstract_Factory;

public class AppleComputerFactory implements ComputerFactory {
    public AppleKeyboard createKeyboard() {
        return new AppleKeyboard();
    }

    public AppleMouse createMouse() {
        return new AppleMouse();
    }

}
