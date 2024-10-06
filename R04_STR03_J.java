import java.math.BigInteger;

public class R04_STR03_J {
    //compliant version
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString();
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray);
    x = new BigInteger(ns);
}
