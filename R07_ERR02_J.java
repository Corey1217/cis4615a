import java.util.logging.*;

public class R07_ERR02_J {
    Logger logger;

    //compliant version
    try {
        // thing to be tried
    } catch (SecurityException se) {
        logger.log(Level.SEVERE, se);
        // recover
    }
}
