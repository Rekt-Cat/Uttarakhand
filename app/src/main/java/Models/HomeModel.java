package Models;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class HomeModel implements Serializable {
    int image;
    String places,rating,details;

    public HomeModel(int image,String places,String rating,String details){
        this.image=image;
        this.places=places;
        this.rating=rating;
        this.details=details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
