import java.io.*;

public class R02_XP00_J {

   //non-compliant version
   public void deleteFile() {
        File someFile = new File("someFileName.txt");
        //something happens
        someFile.delete();
    }
}
