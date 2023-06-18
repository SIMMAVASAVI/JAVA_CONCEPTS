package demo;

public class Student {

    private int id;
    private String name;
    private int rollno;


    public Student() {

    }

    public Student(int id, String name, int rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
