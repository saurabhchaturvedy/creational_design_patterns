package abstract_factory_solution;

public class PinkThemeWidgetFactory implements WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new PinkThemeScrollbar();
    }

    @Override
    public Window createWindow() {
        return new PinkThemeWindow();
    }
}
