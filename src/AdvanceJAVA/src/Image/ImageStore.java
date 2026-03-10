package Image;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageStore {
    public static void main(String[] args) {
        String sourcePath = "src/Image/AshtamPhotoPassportSize.jpg";
        String destinationPath="OutPut/copied.jpg";
        try{
            FileInputStream fis=new FileInputStream(sourcePath);
            FileOutputStream fos=new FileOutputStream(destinationPath);

            byte[] buffer=new byte[1024];
            int bytesread;

            while ((bytesread =fis.read(buffer)) !=-1){
                fos.write(buffer,0,bytesread);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
