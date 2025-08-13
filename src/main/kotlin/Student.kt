class Student() {
    var grade: Int = 0
        set(value) {
            if (value in 0..100){
                field = value
            }else{
                field = 0
            }
        }


    val isPassed: Boolean
        get() = grade > 60






}