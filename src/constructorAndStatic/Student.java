package constructorAndStatic;

public class Student {
    String name; //default for String is null
    int rollno; // default for int is 0

    //when we dont add any constructor in the class, java adds a default constructor
    //it creates an object with all data members as default values
    /*
        public Employee(){
        }
     */


    // In this, we can set values for any number of attributes.
    //No-arg constructor, can have some fixed values for the attributes, every object will be created
    //with those values
    public Student(){

        this.name="sai";
        this.rollno=12345;

    }

    //if we pass some/all attributes to constructor it is parameterised constructor
    public Student(String name, int rollno){

        this.name=name;
        this.rollno=rollno;

    }

    //Copy Constructor
    public Student(Student student){
        this.name=student.name;
        this.rollno=student.rollno;
    }


}
