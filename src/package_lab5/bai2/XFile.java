package package_lab5.bai2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class XFile {

    public static Object readObject(String path) throws FileNotFoundException, IOException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject();
            ois.close();
            return object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObject(String path, Object object) throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
