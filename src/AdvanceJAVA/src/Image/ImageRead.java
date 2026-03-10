package Image;

import java.io.FileInputStream;

public class ImageRead {
    public static void main(String[] args) {
        String path="OutPut/copied.jpg";

        try{
            FileInputStream fis=new FileInputStream(path);

            int size=0;

            while(fis.read()!=-1){
                size++;
            }
            fis.close();

            System.out.println("Image readed successfully");
            System.out.println("Image size : "+size+" byte");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
