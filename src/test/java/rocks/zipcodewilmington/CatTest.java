package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void speakTest(){
        Cat cat =  new Cat("garfield", new Date(), 10);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals("should be meow", expected, actual);
    }
    @Test
    public void setNameTest(){
        Cat garfield = new Cat("garfield", new Date(), 10);
        garfield.setName("shazam");
        String expected = "shazam";
        String actual = garfield.name;
        Assert.assertEquals("garfield.name should be equal to shazam", expected, actual);
    }
    @Test
    public void eatTest(){
        Cat cat = new Cat("garfield", new Date(), 10);
        int expected =1;
        cat.eat();
        int actual =  cat.numberOfMealsEaten;
        Assert.assertEquals("should be 1", expected, actual);
    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void checkInstanceOfCat(){
        Cat garfield = new Cat("garfield", new Date(), 10);
        boolean expected =true; 
        boolean actual = garfield instanceof Cat;
        Assert.assertEquals("check if instance of cat", expected, actual);
    }

}
