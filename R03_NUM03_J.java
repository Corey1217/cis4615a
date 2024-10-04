import java.io.*;

public class R03_NUM03_J {

    //non-compliant version
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }
}
