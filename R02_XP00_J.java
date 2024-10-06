import java.io.*;

public class R02_XP00_J {

   //compliant version
   public void deleteFile() {
        File someFile = new File("someFileName.txt");
        //something happens
        if (!someFile.delete()) {
            // handle failed file deletion
        }
    }
}
