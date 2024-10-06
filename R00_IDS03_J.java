import java.util.logging.*;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    String username;
    boolean loginSuccessful;
    Logger logger;

    //compliant version
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
        logger.severe("User login failed for " + sanitizeUser(username));
    }
    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}
