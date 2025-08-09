public class Episode {
    String title;
    float duration;
    public Episode(String title, float duration){
        this.title = title;
        this.duration = duration;
    }

    void show(){
        System.out.println("Title: " + this.title + ", duration: " + this.duration);
    }

    public static void main(String[] args) {
        Episode episode1 = new Episode("first episode", 12.5f);
        Episode episode2 = new Episode("second episode", 20.7f);
        Episode episode3 = new Episode("third episode", 12.9f);
        Episode episode4 = new Episode("fourth episode", 46.53f);
        Episode episode5 = new Episode("fifth episode", 72.3f);
        episode1.show();
        episode2.show();
        episode3.show();
        episode4.show();
        episode5.show();
    }
}
