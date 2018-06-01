package modelo;

import java.net.URI;

public class Item {

    //Propiedades del objeto
    String title;
    String description;

    //Constructor
    public Item(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    //Getter
    public String getTitle() {
        return title;
    }

    //Setter
    public void setDescription(String description) {
        this.description = description;
    }

    //Getter
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
