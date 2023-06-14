package package_ASM1;

import java.io.Serializable;

public class Employee implements Serializable {

    private String id, name, email;
    private float salary;
    private int age;

    public Employee() {
    }

    public Employee(String id, String name, String email, float salary, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}