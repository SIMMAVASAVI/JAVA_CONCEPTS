package inheritanceandPolymorphism;

public class Client {

    public static void main(String[] args) {

        //accessing parents constructor using super keyword from child constructor, constructor chaining
        Student s= new Student(123,"vasavi","123456785","kjhjalkjl", "ahsjlkj@hkj.com", "hakjh",8.9,9.0);
        //accessing parents method using child reference
        s.getDetails();

        //method overloading
        s.attendLecture();
        s.attendLecture(1);
        s.attendLecture("Java");

        //upcasting, polymorphism in inheritance
        User ustudent=new Student();
        User uta=new TA();

        //In case of upcasting, the object holds all the possible attributes and methods,
        //but since we are using reference variable of parent class, we will only able to use
        //attributes and methods available in the parent class, even object contains more.
        ValidationService valser=new ValidationService();
        valser.validateEmail(ustudent);
        valser.validateEmail(uta);
        valser.validateEmail(new Mentor());


        //method overriding - same methodname and signature but different implementation - between parent child classes
        valser.overload(ustudent);
        valser.overload(uta);
        valser.overload(new Mentor());
        valser.overload(new Instructor());

    }

}

// super for constructor chaining, this for constructor telescoping
