class Car(speed: Int):Vehicle(speed) {
    fun  increaseSpeed(amount: Int){
        speed += amount
        if (speed > 120) speed = 120
    }
}