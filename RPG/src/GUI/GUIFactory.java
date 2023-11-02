package GUI;


public abstract class GUIFactory {
    public abstract Window createWindow(String title);
    public abstract Button createButton(String label);
}
