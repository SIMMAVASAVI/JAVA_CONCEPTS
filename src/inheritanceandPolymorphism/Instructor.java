package inheritanceandPolymorphism;

public class Instructor extends User{
    int noLectures;
    double rating;

    public Instructor(){

    }

    public Instructor(int id, String name, String phone, String address, String email, String password, int noLectures, double rating) {
        super(id, name, phone, address, email, password);
        this.noLectures=noLectures;
        this.rating=rating;

    }

    //total attributes -> 6[User] + 2 = 8
    //total methods -> 1[User] + 0 = 1

    public void attendLecture(){
        System.out.println("Instructor is teaching in the lecture");
    }

}
