package package_lab5.bai3;


import java.io.Serializable;

public class Staff implements Serializable {
    public String fullname;
    public double salary;

    public Staff() {
    }

    public Staff(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    
}