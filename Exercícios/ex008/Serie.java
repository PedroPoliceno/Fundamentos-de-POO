import java.util.ArrayList;

public class Serie {
    ArrayList <Episode> episodes = new ArrayList<Episode>();
    String  name;

    public Serie (String name) {
        this.name = name;
        this.episodes = new ArrayList<>();
    }

    void addEpisode (Episode newEpisode) {
        this.episodes.add(newEpisode);
    }

    void showSerie (){
        System.out.print("Title: " + this.name + "\n");
        for(Episode episode : this.episodes){
            System.out.println(episode.title + ",\b duration: " + episode.duration);
        }
    }

    public static void main(String[] args) {
        Episode episode1 = new Episode("first episode", 12.5f);
        Episode episode2 = new Episode("second episode", 20.7f);
        Episode episode3 = new Episode("third episode", 12.9f);
        Serie newSerie = new Serie("Serie 1");
        newSerie.addEpisode(episode1);
        newSerie.addEpisode(episode2);
        newSerie.addEpisode(episode3);

        newSerie.showSerie();
    }
}
