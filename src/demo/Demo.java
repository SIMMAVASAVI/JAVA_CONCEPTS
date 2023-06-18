package demo;

public class Demo {

    public static void main(String[] args) {

        //created an object for Student class and stored in Student type reference variable st
        Student st= new Student();
        System.out.println(st.toString());

        Student st1= new Student(1,"vasavi",1773402);
        System.out.println(st1.toString());

    }


}
