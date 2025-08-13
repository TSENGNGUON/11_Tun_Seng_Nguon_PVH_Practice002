class Book (var title: String, var author: String,var age:Int){
    init {
        require(title.isNotBlank()) {"Title is not blank"}
        require(author.isNotBlank()) {"Author is not blank"}
        require(age >= 0) {"Age must be greater than or equal to 0."}
    }
}