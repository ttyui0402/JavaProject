package OOP_Design_pattern.Factory_Method.Computer;

public class MouseFactory {
    public Mouse createMouse(String type) {
        Mouse mouse = null;

        switch (type) {
            case "Apple" -> {
                mouse = new AppleMouse();
            }

            case "Samsung" -> {
                mouse = new SamsungMouse();
            }
        }
        return mouse;
    }
}
