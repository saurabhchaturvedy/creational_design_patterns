package abstract_factory_problem;

public class Client {

    public static void initializeGUI(Scrollbar scrollbar, Window window) {
        System.out.println("Initializing the GUI with " + scrollbar.getClass().getSimpleName() + " and " + window.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        Scrollbar scrollbar = new YellowThemeScrollbar();
        Window window = new YellowThemeWindow();

        initializeGUI(scrollbar, window);
        scrollbar = new PinkThemeScrollbar();
        window = new YellowThemeWindow();
        initializeGUI(scrollbar, window);

    }
}
