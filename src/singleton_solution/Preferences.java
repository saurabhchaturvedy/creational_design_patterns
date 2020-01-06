package singleton_solution;

import java.util.function.Predicate;

public class Preferences {

    private static Preferences preferences = null;

    protected Preferences() {
    }

    private synchronized static void createInstance() {
        if (preferences == null) preferences = new Preferences();
    }

    public static Preferences getInstance() {
        if (preferences == null) createInstance();
        return preferences;
    }

    public void helloSingleton() {
        System.out.println("Hello , I'm a singleton");
    }
}
