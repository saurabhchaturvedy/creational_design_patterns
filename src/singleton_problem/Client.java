package singleton_problem;

public class Client {


    public static void main(String[] args) {

        System.out.println(Preferences.globalPreference.getPreferencesDetail());
        Preferences secondPreference = new Preferences("Second Preference");
        Preferences.globalPreference = secondPreference;
        System.out.println(Preferences.globalPreference.getPreferencesDetail());
    }
}
