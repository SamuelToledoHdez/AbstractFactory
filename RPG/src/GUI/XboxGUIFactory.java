package GUI;

public class XboxGUIFactory extends GUIFactory {
    @Override
    public Window createWindow(String title) {
        return new XboxWindow(title);
    }

    @Override
    public Button createButton(String label) {
        return new XboxButton(label);
    }
}