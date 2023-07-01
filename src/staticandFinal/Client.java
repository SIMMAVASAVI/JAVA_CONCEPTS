package staticandFinal;

public class Client {

    public static void main(String[] args) {

        Student s= new Student(123);
        //s.id = 2 -> will not work as it is a final attribute
        s.attendInterview();

        //accessing static value, cant change as final
        System.out.println(Student.coursename);

        //access static variable using both Class and object
        Student.schoolname="Santpaul";
        System.out.println(Student.schoolname);
        System.out.println(s.schoolname);

        //accessing static method
        Student.hello();

    }
}
