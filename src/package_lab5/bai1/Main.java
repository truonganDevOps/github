package package_lab5.bai1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
   
        byte[] data = XFile.read("C:\\Users\\TruongAn\\Desktop\\spring\\test");
        XFile.write("C:\\Users\\TruongAn\\Desktop\\spring\\test.txt", data);

//        try {
//            String path = "test.txt";
//            XFile.write(path, "Hello world! How are you today?".getBytes());
//            byte[] data = XFile.read(path);
//            System.out.println("Read Data: " + new String(data));
//        } catch (IOException ex) {
//            System.out.println("Error:" + ex.getMessage());
//        }
    }
}

