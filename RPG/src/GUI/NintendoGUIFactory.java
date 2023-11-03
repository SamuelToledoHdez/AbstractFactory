package GUI;

public class NintendoGUIFactory extends GUIFactory {
    @Override
    public Window createWindow(String title) {
        return new NintendoWindow(title);
    }

    @Override
    public Button createButton(String label) {
        return new NintendoButton(label);
    }
}
