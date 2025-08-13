class Employee(name: String):Person(name) {
    override fun introduce() {
        println("Hello I'm $name")
    }
}