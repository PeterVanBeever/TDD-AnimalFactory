package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    //  - Create tests for `void add(Dog dog)`
    //  - Create tests for `void remove(Integer id)`
    //  - Create tests for `void remove(Dog dog)`
    //  - Create tests for `Dog getDogById(Integer id)`
    //  - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetTotalDogs() {
        //add some dogs
        DogHouse.clear();
        Dog resuceDog1 = new Dog();
        Dog resuceDog2 = new Dog();
        Dog resuceDog3 = new Dog();
        DogHouse.add(resuceDog1);
        DogHouse.add(resuceDog2);
        DogHouse.add(resuceDog3);
        Integer totalDogs = DogHouse.getNumberOfDogs();
        // object Integer vs int,
        // !! not the same as int 3,
        Assert.assertEquals(Integer.valueOf(3), totalDogs);
        System.out.println(totalDogs);
        System.out.println(Integer.valueOf(3));


    }

    @Test
    public void testGetDogID() {
        // given
        Dog dog = new Dog("Spike", new Date(), 73);
        DogHouse.add(dog);
        // when
        Dog checkDogID = DogHouse.getDogById(73);
        // then
        Assert.assertEquals(dog, checkDogID);

    }

    @Test
    public void removeSpecificDog() {
        DogHouse.clear();
        Dog spot = new Dog("Spot", new Date(), 1);
        // remove specific
        DogHouse.add(spot);
        DogHouse.remove(spot);
        // check if was removed?
        Dog spotGhost = DogHouse.getDogById(1);//
        // is it gone?
        // null = not there
        Assert.assertNull(spotGhost);

    }

    @Test
    public void testAddDog() {
        DogHouse.clear();
        // given a new cat
        Dog strayDog = new Dog("sunny", new Date(), 1);
        // when action add the cat
        DogHouse.add(strayDog);
        // check if retrieve cat from house
        Dog newPet = DogHouse.getDogById(strayDog.getId());
        // check if new cat equals cat added to house?
        Assert.assertEquals("sunny", newPet.getName());
    }

    @Test
    public void testRemoveDogByID() {
        //empty cat house before adding one and testing removal
        DogHouse.clear();
        //create new cat
        Dog Fido1 = new Dog("Mr. Fido", new Date(), 1);
        //add the new cat
        DogHouse.add(Fido1);
        // remove the new cat by it's id
        DogHouse.remove(Fido1.getId());
        // check if cat was removed?
        Dog whereFido = DogHouse.getDogById(Fido1.getId());//
        // is it gone?
        Assert.assertNull(whereFido);

    }
}
