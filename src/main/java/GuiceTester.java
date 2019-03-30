import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
        editor.makeConnection();
    }
}

/*
class WinWordSpellCheckerImpl extends SpellCheckerImpl{

    @Override
    public void checkSpelling() {
        System.out.println("Inside WinWordSpellCheckerImpl.checkSpelling." );
    }
}*/
