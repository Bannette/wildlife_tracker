package models;


public class Endangered {
    private String animal_name;
    private String animal_age;
    private String animal_health;
    private String location;

    public Endangered(String animal_name,String animal_age,String  animal_health ,String location) {
        this.animal_name = animal_name;
        this.animal_age = animal_age;
        this.animal_health = animal_health;
        this.location = location;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public String getAnimal_age() {
        return animal_age;
    }

    public String getAnimal_health() {
        return animal_health;
    }

    public String getLocation() {
        return location;
    }
}


