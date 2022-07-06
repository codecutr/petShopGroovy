package petShopGroovy

Pet cat = new Pet(petType: "CAT")

println("Name is currently " + cat.getName())

cat.setName("Garfield")

println("Name has been changed to " + cat.getName())

DataSim data = new DataSim()

data.insert("Pet", cat)

//New code to demonstrate the additional functionality.

println("----------------------------------------------")

Pet cat2 = new Pet(name:"Kelly", petType: "CAT")

println("Name is currently " + cat2.getName())

cat2.setName("Mary")

println("Name has been changed to " + cat2.getName())

cat2.setName("Katy Purry")

println("Name has been changed to " + cat2.getName())

//Database does not keep track of former names.  Just the last name change.
//Would change this in next version.
data.insert("Pet", cat2)

println("Former names are: " + cat2.getFormerNames())

println("Average name length is: " + cat2.getAverageNameLength())

println("Cat's original age is: " + cat2.getAge())

for (int i = 1; i <= 10; i++)
{
    cat2.speak()
    println("Number of times cat has spoken: " + i)
    println("Cat's current age is: " + cat2.getAge())
}
//Try adding a cat to the Pet table with no name.  Very sad.
Pet catWithNoName = new Pet(petType: "CAT")
data.insert("Pet", catWithNoName)

//Try adding a dog to the Pet table with no name.  Also, very sad.
Pet dogWithNoName = new Pet(petType: "DOG")
data.insert("Pet", dogWithNoName)

//Check dog speak
dogWithNoName.speak()

System.out.println("----------------------------------------------")
DataTasks dt = new DataTasks()
dt.savePetShop()


