import java.util.logging.*;

public class R00_IDS03_J {
    String username;
    boolean loginSuccessful;
    Logger logger;

    //non-compliant version
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + username);
    } else {
        logger.severe("User login failed for " + username);
    }
}
