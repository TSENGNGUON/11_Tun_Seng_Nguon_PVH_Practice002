sealed class Result {
    class Success(var value: String): Result()
    class Error(var message: String): Result()
}