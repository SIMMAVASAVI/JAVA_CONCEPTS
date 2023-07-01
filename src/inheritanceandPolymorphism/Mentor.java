package inheritanceandPolymorphism;

public class Mentor extends User{
    int noSessions;
    double rating;

    public Mentor(){

    }

    public Mentor(int id, String name, String phone, String address, String email, String password, int noSessions, double rating) {
        super(id, name, phone, address, email, password);
        this.noSessions=noSessions;
        this.rating=rating;

    }

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1

    public void attendLecture(){
        System.out.println("Mentor is creating notes from the lecture");
    }
}
