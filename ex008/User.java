import java.util.ArrayList;

public class User {
    String email;
    String name;
    String password;
    ArrayList<Serie> seriesWatched = new ArrayList<Serie>();
    public User (String emailOut,String nameOut,String passwordOut){
        this.email = emailOut;
        this.name = nameOut;
        this.password = passwordOut;
        seriesWatched = new ArrayList<>();
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

    Boolean addSeriesWatched(Serie serie){
        if (this.seriesWatched.contains(serie)){
            System.out.println("This serie already exist in history");
            return false;
        } else {
            this.seriesWatched.add(serie);
            System.out.println("Serie \"" + serie.name + "\" has been add in history.");
            return true;
        }
    }

    void showSeries(){
        for (Serie series : seriesWatched){
            series.showSerie();
        }
    }

    public static void main(String[] args) {
        User user = new User("pedrooswg@gmail.com", "Pedro", "300855");
        user.showName_email();
        user.validPassword("123456");
        user.validPassword("300855");

        Serie serie1 = new Serie("Serie 1");
        Episode episode1 = new Episode("first episode", 12.5f);
        Episode episode2 = new Episode("second episode", 20.7f);
        Episode episode3 = new Episode("third episode", 12.9f);
        serie1.addEpisode(episode1);
        serie1.addEpisode(episode2);
        serie1.addEpisode(episode3);
        
        user.addSeriesWatched(serie1);
        user.showName_email();
        user.showSeries();
        user.addSeriesWatched(serie1);
    }
}
