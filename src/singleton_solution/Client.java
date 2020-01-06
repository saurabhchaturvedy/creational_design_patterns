package singleton_solution;

public class Client {

    public static void main(String[] args) {
        Preferences.getInstance().helloSingleton();
        MyPreferences.getInstance().helloSingleton();

        System.out.println(Preferences.getInstance().hashCode());
        System.out.println(MyPreferences.getInstance().hashCode());
    }
}
