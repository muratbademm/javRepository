public class Film {
    private int rental_duration;
  //  private double rental_rate;
    private String rating;
   // private String title;
    private String special_features;
    private int length;

    public Film(int rental_duration, String rating, String special_features, int length) {
        this.rental_duration = rental_duration;
        //this.rental_rate = rental_rate;
        this.rating = rating;
       // this.title = title;
        this.special_features = special_features;
        this.length = length;
    }
}
