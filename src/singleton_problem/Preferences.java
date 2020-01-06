package singleton_problem;

public class Preferences {

    public static Preferences globalPreference = new Preferences("First Preference");

    private String preference;

    public Preferences(String preference) {
        this.preference = preference;
    }

    public String getPreferencesDetail() {
        return preference;
    }
}
