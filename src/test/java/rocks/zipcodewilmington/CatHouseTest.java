package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    //  - Create tests for `void add(Cat cat)`
    //  - Create tests for `void remove(Integer id)`
    //  - Create tests for `void remove(Cat cat)`
    //  - Create tests for `Cat getCatById(Integer id)`
    //  - Create tests for `Integer getNumberOfCats()`

@Test
public void testGetTotalCats(){
    //add some cats
    CatHouse.clear();
    Cat kittenOne = new Cat();
    Cat kittenTwo = new Cat();
    Cat kittenThree = new Cat();
    CatHouse.add(kittenOne);
    CatHouse.add(kittenTwo);
    CatHouse.add(kittenThree);
    Integer totalCats = CatHouse.getNumberOfCats();
    // object Integer vs int,
    // !! not the same as int 3,
    Assert.assertEquals(Integer.valueOf(3),totalCats);
    System.out.println(totalCats);
    System.out.println(Integer.valueOf(3));


}

@Test
public void testGetCatID(){
    // given
    Cat cat = new Cat("Spike", new Date(),100);
    CatHouse.add(cat);
    // when
    Cat checkCatID = CatHouse.getCatById(100);
    // then
    Assert.assertEquals(cat, checkCatID);

}
@Test
public void removeSpecificCat(){
    CatHouse.clear();
    Cat furball = new Cat("Furball",new Date(),1);
    // remove specific cat
    CatHouse.add(furball);
    CatHouse.remove(furball);
    // checkif cat was removed?
    Cat furballMissing = CatHouse.getCatById(1);//
    // is it gone?
    Assert.assertNull(furballMissing);
    // check if still there
    //Cat furballCat = CatHouse.remove(furball);
}
 @Test
public void testAddCat(){
    CatHouse.clear();
     // given a new cat
     Cat strayCat = new Cat("kitten", new Date(),1);
     // when action add the cat
     CatHouse.add(strayCat);
     // check if retrieve cat from house
     Cat newPet = CatHouse.getCatById(strayCat.getId());
     // check if new cat equals cat added to house?
     Assert.assertEquals(strayCat, newPet);
 }
 @Test
    public void testRemoveCatByID(){
        //empty cat house before adding one and testing removal
        CatHouse.clear();
        //create new cat
        Cat strayCat = new Cat("kitten", new Date(),1);
        //add the new cat
        CatHouse.add(strayCat);
        // remove the new cat by it's id
        CatHouse.remove(strayCat.getId());
        // check if cat was removed?
        Cat missingCat = CatHouse.getCatById(strayCat.getId());//
        // is it gone?
        Assert.assertNull(missingCat);

//        CatHouse.getCatById(1);
//        CatHouse.remove(1);


//     public static void remove(Integer id) {
//         catHouse.removeAnimalById(id);


 }


}