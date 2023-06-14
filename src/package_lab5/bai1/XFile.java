package package_lab5.bai1;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class XFile {

    public static byte[] read(String path) throws FileNotFoundException, IOException {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];

            fis.read(data);
            fis.close();
            
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, byte[] data) throws FileNotFoundException, IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

