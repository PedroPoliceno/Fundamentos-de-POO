public class User {
    String email;
    String name;
    String password;
    public User (String emailOut,String nameOut,String passwordOut){
        this.email = emailOut;
        this.name = nameOut;
        this.password = passwordOut;
    }

    void showName_email(){
        System.out.println(this.email);
        System.out.println(this.name);
    }

    void validPassword(String try_password){
        if(try_password == password){
            System.out.println("This password is correct");
        } else {
            System.out.println("This password is wrong");
        }
    }

    public static void main(String[] args) {
        User user = new User("pedrooswg@gmail.com", "Pedro", "300805Ph.");
        user.showName_email();
        user.validPassword("123456");
        user.validPassword("300805Ph.");
    }
}
