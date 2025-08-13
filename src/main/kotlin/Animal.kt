open class Animal(var name: String, var soundCount : Int = 0) {
    open fun speak(){
        println("$name makes a sound")
        soundCount++
    }
}