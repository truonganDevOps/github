package package_lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();

        Student sv1 = new Student();
        sv1.name = "An";
        sv1.major = "Phát Triển Phần Mềm";
        sv1.marks = 9.0;
        Student sv2 = new Student();
        sv2.name = "Anh";
        sv2.major = "Ứng Dụng Phần Mềm";
        sv2.marks = 5.0;
        Student sv3 = new Student();
        sv3.name = "Ang";
        sv3.major = "Thiết Kế Web";
        sv3.marks = 7.0;
        map.put(sv1.name, sv1);
        map.put(sv2.name, sv2);
        map.put(sv3.name, sv3);
        
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println(">Ho va ten: " + sv.name);
            System.out.println(">Hoc luc: " + sv.getGrade());
        }
    }
}
