import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
       /* bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(WinWordSpellCheckerImpl.class);*/
        //bind(SpellChecker.class).to(SpellCheckerImpl.class);
       /* try {
            bind(SpellChecker.class)
                    .toConstructor(SpellCheckerImpl.class.getConstructor());
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("Required constructor missing");
        }*/

      /*  bind(String.class)
                .annotatedWith(Names.named("JDBC"))
                .toInstance("jdbc:mysql://localhost:5326/emp");*/

       // bind(SpellChecker.class).toProvider(SpellCheckerProvider.class);
    }

   /* @Provides
    public SpellChecker provideSpellChecker() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
        return SpellChecker;
    }*/

}
