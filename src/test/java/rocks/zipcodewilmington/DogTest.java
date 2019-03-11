package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import java.util.Date;

public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
     public void speakTest(){
        Cat cat =  new Dog("fred", new Date(), 10);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals("should be bark", expected, actual);
    }
     @Test
    public void setNameTest(){
        Dog dog = new Dog("Milo", new Date(), 10);
         dog.setName("shazam");
        String expected = "shazam";
        String actual = dog.name;
        Assert.assertEquals("milo.name should be equal to shazam", expected, actual);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("Milo", new Date(), 10);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
