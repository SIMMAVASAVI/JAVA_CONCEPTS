package inheritanceandPolymorphism;

public class User {

    int id;
    String name;
    String phone;
    String address;
    String email;
    String password;

    public User(){

    }

    public User(int id, String name, String phone, String address, String email, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public void getDetails(){
        System.out.println("ID : "+this.id);
        System.out.println("Name : "+this.id);
        System.out.println("Phone : "+this.id);
        System.out.println("Address : "+this.id);
        System.out.println("Email : "+this.id);
        System.out.println("Password : "+this.id);
    }

    public void attendLecture(){
        System.out.println("User is attending lecture");
    }


}
