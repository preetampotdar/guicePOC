import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker {
    //@Inject @Named("JDBC")
    private String dbUrl;
    private String user;
    private Integer timeout;



    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
        System.out.println(dbUrl);
        System.out.println(user);
        System.out.println(timeout);
    }

    @Inject
    public SpellCheckerImpl(String dbUrl,
                            String user,
                            Integer timeout) {
        this.dbUrl = dbUrl;
        this.user = user;
        this.timeout = timeout;
    }

    public SpellCheckerImpl(){

        System.out.println("here in default const");
    }

   /* public SpellCheckerImpl(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }*/

}
