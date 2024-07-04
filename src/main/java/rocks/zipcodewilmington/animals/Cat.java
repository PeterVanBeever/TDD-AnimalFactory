package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {
    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public Cat() {
        super();
    }

    public Integer getId() {
        // get ID
        return super.getId();
    }
//    public Integer getId() {
//        return super.getId();
//    }

    public String speak() {
        return "Meow";
    }

    public String eat() {
        return "Milk";

    }

    public void setId(Integer catID) {
    }
    //public Integer
}
