package petShopGroovy

import org.junit.jupiter.api.Test

//import org.junit.jupiter.api.Test;

/**
 * @author Meg Fryling
 * @version 5.23.2022
 */
class PetTest {

    /**
     * Test method for {@link petShopGroovy.Pet()}.
     */
    @Test
    void testCat() {
        Pet cat = new Pet(name:"Puddy Tat", petType: "CAT")
        //assert that a cat’s initial age is between 5 and 10
        assert (cat.getAge() >= 5)
        assert (cat.getAge() <= 10)
    }

    /**
     * Test method for {@link petShopGroovy.Pet(java.lang.String)}.
     */
    @Test
    void testCatString() {
        Pet cat = new Pet(name:"Skimbleshanks", petType: "CAT")
        assert(cat.getName() != null)
        //assert that a cat’s initial age is between 5 and 10
        assert(cat.getAge() >= 5)
        assert(cat.getAge() <= 10)
    }

    /**
     * Test method for {@link petShopGroovy.Pet#speak()}.
     */
    @Test
    void testSpeak() {
        Pet cat1 = new Pet(petType: "CAT")

        //Age should not change after speaking only once.
        int origAge = cat1.getAge()
        cat1.speak()
        int newAge = cat1.getAge()
        assert(newAge == origAge)

        //After speaking 5 times, the cat should be 1 year older
        for (int i = 0; i < 4; i++)
        {
            cat1.speak()
        }
        newAge = cat1.getAge()
        assert(newAge == origAge+1)

        Pet cat2 = new Pet(petType: "CAT")
        origAge = cat2.getAge()
        //After speaking 10 times, the cat should be 2 years older
        for (int i = 0; i < 10; i++)
        {
            cat2.speak()
        }
        newAge = cat2.getAge()
        assert(newAge == origAge+2)

        //Age should not change after speaking 12 times
        origAge = cat2.getAge()
        cat2.speak()
        cat2.speak()
        newAge = cat2.getAge()
        assert(newAge == origAge)
    }

    /**
     * Test method for {@link petShopGroovy.Pet#speak(java.lang.String)}.
     */
    @Test
    void testSpeakString() {
        Pet cat1 = new Pet(petType: "CAT")

        //Age should not change after speaking only once.
        int origAge = cat1.getAge()
        cat1.speak("What?")
        int newAge = cat1.getAge()
        assert(newAge == origAge)

        //After speaking 5 times, the cat should be 1 year older
        for (int i = 0; i < 4; i++)
        {
            cat1.speak("What?")
        }
        newAge = cat1.getAge()
        assert(newAge == origAge+1)

        Pet cat2 = new Pet(petType: "CAT")
        origAge = cat2.getAge()
        //After speaking 10 times, the cat should be 2 years older
        for (int i = 0; i < 10; i++)
        {
            cat2.speak("Didn't do it!")
        }
        newAge = cat2.getAge()
        assert(newAge == origAge+2)

        //Age should not change after speaking 12 times
        origAge = cat2.getAge()
        cat2.speak("Didn't do it!")
        cat2.speak("Didn't do it!")
        newAge = cat2.getAge()
        assert(newAge == origAge)
    }


    /**
     * Test method for {@link petShopGroovy.Pet#setName()}.
     */
    @Test
    void testSetName() {

        Pet cat1 = new Pet(name:"Kelly", petType: "CAT")
        //Should have 0 former names
        assert(cat1.getFormerNames().size() == 0)
        cat1.setName("Mary")
        //Should have 1 former names
        assert(cat1.getFormerNames().size() == 1)
        cat1.setName("Katy Purry")
        //Should have 2 former names
        assert(cat1.getFormerNames().size() == 2)
        cat1.setName("Rum Tum Tugger")
        //Should have 3 former names
        assert(cat1.getFormerNames().size() == 3)

    }

    /**
     * Test method for {@link petShopGroovy.Pet#getAverageNameLength()}.
     */
    @Test
    void testGetAverageNameLength() {

        Pet cat1 = new Pet(name:"Kelly", petType: "CAT")
        //Average name length should be 5
        assert(cat1.getAverageNameLength() == 5)
        cat1.setName("Mary")
        //Average name length should be 4.5
        assert((double)cat1.getAverageNameLength() == 4.5)
        cat1.setName("Katy Purry")
        //Average name length should be 6.33 (rounded to 2 decimal places)
        assert(Math.round(cat1.getAverageNameLength() * 100.0)/100.0 == 6.33)
        cat1.setName("Rum Tum Tugger")
        //Average name length should be 5
        assert((double)cat1.getAverageNameLength() == 8.25)

    }

}


