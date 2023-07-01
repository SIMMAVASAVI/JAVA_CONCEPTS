package inheritanceandPolymorphism;

public class ValidationService {

    // upcasting reduced code redundancy
//    public boolean validateEmail(Student student){
//        if( student.email==null){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public boolean validateEmail(TA ta){
//        if( ta.email==null){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public boolean validateEmail(Mentor mentor){
//        if( mentor.email==null){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//

    public void validateEmail(User user){
        //accepts a type of user reference variable. Since, upcasting is possible,
        // all the child objects of User can be upcasted to a user reference variable,
        // hence, we can use all objects of User for this method as well.
        if( user.email==null){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public void overload(User user){ //Student obj, TA obj, Mentor obj

        user.attendLecture();

    }
}
