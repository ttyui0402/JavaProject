package OOP_Design_pattern.Factory_Method.Computer;

public class KeyboardFactory {
    public Keyboard createKeyBoard(String type) {
        Keyboard keyboard = null;

        switch (type) {
            case "Apple" -> {
                ;
                keyboard = new AppleKeyboard();
            }
            case "Samsung" -> {
                ;
                keyboard = new SamsungKeyboard();
            }
        }
        return keyboard;
    }
}
