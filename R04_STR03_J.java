import java.math.BigInteger;

public class R04_STR03_J {
    //non-compliant version
    BigInteger x = new BigInteger("650394009555");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
}
