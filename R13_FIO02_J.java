import java.io.File;

public class R13_FIO02_J {
    //compliant version
    File file = new File("file");
    if (!file.delete()) {
        // handle failed deletion error
    }
}
