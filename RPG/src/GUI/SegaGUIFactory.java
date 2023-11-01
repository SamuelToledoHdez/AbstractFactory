package GUI;

public class SegaGUIFactory extends GUIFactory {
    @Override
    public Window createWindow(String title) {
        return new SegaWindow(title);
    }

    @Override
    public Button createButton(String label) {
        return new SegaButton(label);
    }
}