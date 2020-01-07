package abstract_factory_solution;

import abstract_factory_solution.Scrollbar;
import abstract_factory_solution.Window;

public class Client {


    public static void initializeGUI(WidgetFactory widgetFactory) {
        initializeGUI(widgetFactory.createScrollbar(), widgetFactory.createWindow());
    }


    public static void initializeGUI(Scrollbar scrollbar, Window window) {
        System.out.println("Initializing the GUI with " + scrollbar.getClass().getSimpleName() + " and " + window.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        WidgetFactory widgetFactory = new YellowThemeWidgetFactory();
        initializeGUI(widgetFactory);


    }
}
