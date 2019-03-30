import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.logging.Logger;

public class TextEditor {
    private SpellChecker spellChecker;
    private String dbUrl;
    private Logger logger;
    @Inject
    public TextEditor(SpellChecker spellChecker, String dbUrl,  Logger logger) {
        this.spellChecker = spellChecker;
        this.dbUrl = dbUrl;
        this.logger = logger;

    }


    public void makeSpellCheck() {
        System.out.println(spellChecker.getClass());
        logger.info("In TextEditor.makeSpellCheck() method");
        spellChecker.checkSpelling();
    }


    public void makeConnection() {
        System.out.println(dbUrl);
    }

}
