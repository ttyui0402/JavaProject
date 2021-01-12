package OOP_Design_pattern.Factory_Method.Computer;

public class ComputerFactory {
    public void createComputer(String type) {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();

        keyboardFactory.createKeyBoard(type);
        mouseFactory.createMouse(type);

        System.out.println("---" + type + "컴퓨터 완성!");
    }
}
