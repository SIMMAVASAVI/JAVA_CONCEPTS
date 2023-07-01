package inheritanceandPolymorphism;

public class Student extends User{
    //all User attributes
    //all User methods
    double psp;
    double attendance;

    public Student(){

    }

    public Student(int id, String name, String phone, String address, String email, String password, double psp, double attendance) {
        //constructor chaining
        super(id, name, phone, address, email, password);
        this.psp=psp;
        this.attendance=attendance;

    }

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1

    //method overloading - same method name, but different signatures - Compile time polymorphism
    public void attendLecture(String lectureName){
        System.out.println("Student is attending lecture : " + lectureName);
    }

    public void attendLecture(int lectureNo){
        System.out.println("Student is attending lecture : " + lectureNo);
    }

    public void attendLecture(){
        System.out.println("Student is learning from the lecture");
    }
}

// child class extends Parent class

