import java.io.*;

public class R03_NUM03_J {

    //compliant version
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // masked with 32 one-bits
    }
}
