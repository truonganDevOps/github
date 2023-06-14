package package_lab8.bai4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

abstract public class DAO<Entity> {

    protected List<Entity> list = new ArrayList<>();

    public void add(Entity entity) {
        list.add(entity);
    }

    public void remove(Entity entity) {
        list.remove(entity);
    }

    abstract public void update(Entity entity);

    abstract public Entity find(Serializable id);

    public List<Entity> getList() {
        return list;
    }

    public void load() {
        try {
            FileInputStream fis = new FileInputStream("prod.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Entity>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void store() {
        try {
            FileOutputStream fos = new FileOutputStream("prod.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
