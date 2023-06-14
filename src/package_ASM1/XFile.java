package package_ASM1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class XFile implements Serializable {

	@SuppressWarnings("finally")
	public static Object readObject(String path) throws Exception {
		Object object = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			if (fis.available() > 0) {
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				ois.close();
			}
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			return object;
		}
	}

	public static void writeOject(String path, Object object) throws Exception {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(object);
			oos.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}