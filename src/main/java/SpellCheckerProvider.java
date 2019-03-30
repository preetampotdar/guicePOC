import com.google.inject.Provider;

public class SpellCheckerProvider implements Provider<SpellChecker> {

public SpellChecker get() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
        return SpellChecker;
        }
        }