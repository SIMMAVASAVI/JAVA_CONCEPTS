package constructorAndStatic;

public class client {

    public static void main(String[] args) {

        //Default constructor called
        Student s= new Student();

        System.out.println(s.name);
        System.out.println(s.rollno);

        //No args constructor
        s.name="vasavi";
        s.rollno=1773402;

        System.out.println(s.name);
        System.out.println(s.rollno);

        //Parameterized constructor
        Student s1=new Student("padma",12);
        System.out.println(s1.name);
        System.out.println(s1.rollno);

        //Copy constructor
        Student s2=new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.rollno);

    }
}
