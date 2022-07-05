package petShopGroovy

/**
 * @author Meg Fryling
 * @version 6.30.2022
 */

class DataTasks {
    Data db  //Create data object

    def savePetShop = { ->
        db = new Data()
        //a.	Create three cats.
        Pet catA = new Pet(name: "Alfalfa", petType: "CAT")
        Pet catB = new Pet(name: "Tater Tot", petType: "CAT")
        Pet catC = new Pet(name: "Burrito", petType: "CAT")
        //b.	Create three dogs.
        Pet dogA = new Pet(name: "Groucho Barks", petType: "DOG")
        Pet dogB = new Pet(name: "Andy War-howl", petType: "DOG")
        Pet dogC = new Pet(name: "Bambam", petType: "DOG")

        //c.	Insert all six pets into the database.
        try {
            db.insert("Pet", catA)
            db.insert("Pet", catB)
            db.insert("Pet", catC)

            db.insert("Pet", dogA)
            db.insert("Pet", dogB)
            db.insert("Pet", dogC)

            //d.	Guarantee that all pets (or no pets) are saved.
            db.commit() //Commit database changes
        }
        catch (Exception e) {
            //d.	Guarantee that all pets (or no pets) are saved.
            db.rollback() //Rollback database changes
            println(e)
        }

    }
}

//Initialize Data object
db = new Data()

//Initialize cat and dog objects with names and save to the database.
cat1 = new Pet(name:"Kit-Kat", petType: "CAT")
dog1 = new Pet(name:"Snoop Dog", petType: "DOG")

try {
    db.insert("Pet", cat1)
    db.insert("Pet", dog1)
    db.commit() //Commit database changes
}
catch (Exception e) {
    db.rollback() //Rollback database changes
    println(e)
}