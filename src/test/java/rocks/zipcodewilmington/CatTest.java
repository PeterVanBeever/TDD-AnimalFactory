package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    //  - Create tests for `void setName(String name)`

    //  - Create tests for `speak`

    //  - Create tests for `setBirthDate(Date birthDate)`

    //  - Create tests for `void eat(Food food)`

    // TODO - Create tests for `Integer getId()`

    //  - Create test to check Animal inheritance; google search `java instanceof keyword`
    //  - Create test to check Mammal inheritance; google search `java instanceof keyword`


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
    public void testCatName(){
        String name = "Fluffy";
        Cat cat = new Cat();
        //test invoke .setName
        cat.setName(name);
        Assert.assertEquals(name,cat.getName());
    }
    @Test
    public void catSpeakTest(){
        String expected = "Meow";
        Cat cat = new Cat();
        //test invoke .speak
        Assert.assertEquals(expected,cat.speak());
    }
    @Test
    public void catEatTest(){
        String expected = "Milk";
        Cat cat = new Cat();
        //test invoke .eat
        Assert.assertEquals(expected,cat.eat());
    }
    @Test
    public void catEatenMealsTest(){
       Cat cat = new Cat();
       Food Milk = new Food();
       // test invoke eat
       cat.eat(Milk);
       // test invoke get number of meals eaten
       int numOfMealsCatAte = cat.getNumberOfMealsEaten();
       Assert.assertEquals(1,numOfMealsCatAte);

    }

    @Test
        public void testIfCatInstanceOfAnimal(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void testIfCatInstanceOfMammal(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Mammal);
    }
    @Test
    public void testCatBirthDate(){
        Cat cat = new Cat();
        Date catBirth = new Date();
        // set cat birth date
        cat.setBirthDate(catBirth);
        // check cat new cat and new birth with get birth
        Assert.assertEquals(catBirth, cat.getBirthDate());

    }

    @Test
    public void testCatID(){
        Cat cat = new Cat("Fluffy",new Date(), 1);
        int num = cat.getId();
        Assert.assertEquals(1, num);
        //
    }


}
//        public Cat(String name, Date birthDate, Integer id) {
//        super(name, birthDate, id);