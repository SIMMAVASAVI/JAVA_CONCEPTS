package inheritanceandPolymorphism;

public class TA extends User{
    int problemsSolved;
    double rating;

    public TA(){

    }

    public TA(int id, String name, String phone, String address, String email, String password, int problemsSolved, double rating) {
        super(id, name, phone, address, email, password);
        this.problemsSolved=problemsSolved;
        this.rating=rating;
    }

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1


    @Override
    public void attendLecture() {
        System.out.println("TA is solving doubts from lecture");
    }

}
