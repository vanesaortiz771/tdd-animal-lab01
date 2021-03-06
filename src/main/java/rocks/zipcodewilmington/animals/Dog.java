package rocks.zipcodewilmington.animals;

import java.util.Date;

public class Dog extends Mammal {
    public String name;
    public Date birthDate;
    public Integer id;
    public int numberOfMealsEaten = 0;
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }
     public void setName(String name){
        this.name = name;
    }
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
    public void eat(){
        this.numberOfMealsEaten += 1;
        System.out.println(numberOfMealsEaten);
    }
    public int id(){
        return 1;
    }
}
