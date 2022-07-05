package petShopGroovy

class Pet {

    String name
    //Keep track of all the Pet's former names
    ArrayList<String> formerNames = new ArrayList<String>()
    Integer age = (int)Math.floor(Math.random()*6+5)
    String favoriteFood
    //Number of times the Pet has spoken (i.e. speak method has been called)
    int speakCount
    //enum petType {Dog,Cat}
    PetTypeEnum petType

    //Don't need constructors in Groovy.

    /**
     * Set Pet name attribute.
     *
     * @param newName Pet's new name
     */

    void setName (String newName) {
        if (name != null) {
            //Add current Pet name to former names ArrayList
            formerNames.add(name)
        }
        //Update Pet name to new name.
        name = newName
    }

    /**
     * Makes the Pet say "Feed Me!" by printing to word to STDOUT
     */
    void speak()
    {
        if (petType.id == "Cat")
        {
            System.out.println("Meow")
        }
        else if (petType.id == "Dog")
        {
            System.out.println("Woof")
        }
        else
        {
            System.out.println("Feed Me!")
        }
        //Call helper method
        speakCountAgeCalculation()
    }

    /**
     * Overload the speak method to allow caller to
     * determine what the Pet is going to say.
     * Again, print word to STDOUT
     *
     * @param words The Pet's official statement.
     */
    void speak(String words)
    {
        System.out.println(words)
        //Call helper method
        speakCountAgeCalculation()
    }

    //Helper method called by speak methods.
    //Pet’s age increases by 1 every five times it speaks.
    private void speakCountAgeCalculation()
    {
        speakCount++
        if (speakCount%5 == 0)
        {
            age++
        }
    }

    /**
     * Return the average length of all the names the Pet has ever had.
     * @return average name length
     */
    double getAverageNameLength()
    {
        int total = name.length()
        for (String name : formerNames) {
            total+= name.length()
        }

        return (double)total/(formerNames.size()+1)
    }

}



