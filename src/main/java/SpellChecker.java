import com.google.inject.ImplementedBy;
import com.google.inject.ProvidedBy;

//@ImplementedBy(SpellCheckerImpl.class)
@ProvidedBy(SpellCheckerProvider.class)
public interface SpellChecker {
    public void checkSpelling();
}
