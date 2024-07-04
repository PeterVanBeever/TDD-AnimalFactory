package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createDog;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    // -  Create Test for `Animal createDog(String name, Date birthDate)`
    // -  Create Test for `Animal createCat(String name, Date birthDate)`


@Test
public void testCreateDog(){
//    AnimalFactory instanceFactory = new AnimalFactory();
//    Dog dog = instanceFactory.createDog("Sparky", new Date());
//    Assert.assertEquals("Sparky", dog.getName());
    //Dog dog = new Dog("Sparky",new Date(),1);
    Dog runt = AnimalFactory.createDog("runt", new Date());
    Assert.assertEquals("runt",runt.getName());
   // String dogMade =
}

@Test
public void testCreateCat(){
    //
    Cat strayGuy = AnimalFactory.createCat("stray",new Date());
    Assert.assertEquals("stray",strayGuy.getName());

    //Assert.assertEquals();

}


}