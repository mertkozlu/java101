package Kodlamaio.KodlaWithNlayeredApp.Entities;

public class Category {
    private String name;
    public Category() {
    }

    public Category(String name) {
        this.setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
