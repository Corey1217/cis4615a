import java.io.File;

public class R13_FIO02_J {
    //non-compliant version
    File file = new File(args[0]);
    file.delete();
}
