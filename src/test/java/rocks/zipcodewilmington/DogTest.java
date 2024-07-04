package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    //  - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    //  - Create tests for `speak`
    //  - Create tests for `setBirthDate(Date birthDate)`
    //  - Create tests for `void eat(Food food)`
    // ? - Create tests for `Integer getId()`
    //   - Create test to check Animal inheritance; google search `java instanceof keyword`
    //  - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testIfInstanceDog(){
        Dog sparky = new Dog();
        Assert.assertTrue(sparky instanceof Animal);


    }


    @Test
    public void testDogID(){
        Dog sparky = new Dog();
        Integer expected = sparky.getId();
        Assert.assertEquals(expected,sparky.getId());
        //

    }

    @Test
    public void feedDogTest(){
        Dog sparky = new Dog();
        Food treat = new Food();
        //feed the dog
        sparky.eat(treat);
        //int numOfMealsDogAte = sparky.getNumberOfMealsEaten();
        Assert.assertEquals(1,sparky.numOfMealsDogAte());

    }

    @Test
    public void dogBirthDateTest(){
        Dog sparky = new Dog();
        Date sparkBirthExpected = new Date();
        sparky.setBirthDate(sparkBirthExpected);
        Assert.assertEquals(sparkBirthExpected,sparky.getBirthDate());
    }

    @Test
    public void dogSpeakTest(){
        Dog dog = new Dog();
        String dogSpeak = "bark!";
        Assert.assertEquals(dogSpeak,dog.speak());
    }

    @Test
    public void newDogTest(){
        Dog dog = new Dog("Spike", new Date(), 6);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }



}

//
