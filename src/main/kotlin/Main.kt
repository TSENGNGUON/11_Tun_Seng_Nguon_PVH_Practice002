fun main(){
    //Define a class called Person with one property name. Create an instance of Person and print the name.
    val person1 = Person("Nguon")
    println(person1.name)
    //    Create inheritance: Make a class Employee that inherits from Person and overrides a function called introduce() to print a custom message.
    val employee = Employee("Bopha")
    employee.introduce()
    //    Create and test objects:
    val book1 = Book("Mindstone book", "nani",34)
    println("Book name: ${book1.title} ")
    println("Book author: ${book1.author} ")
    println("Book year: ${book1.age} ")
//    val book2 = Book("na", "kaaka",-4)
    //    Getter and Setter
    //    ### Kotlin Data Class

    //    - **Define and use a data class:** Create a data class `Product` with `id` and `price`. Instantiate it and print all its properties.
    val donut = Product(1,20.43)
    val donutCopy = donut.copy(price = 10.0)
    println("Product Id: ${donut.id}")
    println("Product Id: ${donut.price}")
    println("---------------------------")
    println("Product Id: ${donutCopy.id}")
    println("Product Id: ${donutCopy.price}")
    //    Kotlin Sealed Classes
    fun uiState(result: Result){
        when (result) {
            is Result.Success -> println("Success ${result.value}")
            is Result.Error -> println("Error ${result.message}")
        }
    }
    val success = Result.Success("do something is success")
    val error = Result.Error("error something")
    uiState(success)
    uiState(error)

    fun getHoliday(days: List<Day>): Int{
       return days.count{it.isHoliday}
    }

    val mySchedule = listOf(
        Day.MONDAY,
        Day.SATURDAY,
        Day.SUNDAY,
        Day.WEDNESDAY
    )

    val countHoliday = getHoliday(mySchedule)
    println(countHoliday)

    // last exercise
    val animals: List<Animal> = listOf(
        Animal("Ava"),
        Dog("Buddy"),
        Animal("Luna"),
        Dog("Max")
    )
    for (animal in animals) {

        animal.speak()
        animal.speak()

        println("Name: ${animal.name}")
        println("Type: ${animal::class.simpleName}")
        println("soundCount: ${animal.soundCount}")

        if (animal is Dog) {
            println("This animal is a dog")
        }

        println()
    }


}