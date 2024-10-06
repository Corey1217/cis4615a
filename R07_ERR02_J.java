public class R07_ERR02_J {
    //non-compliant version
    try {
        // thing to be tried
    } catch (SecurityException se) {
        System.err.println(se);
    }
}
