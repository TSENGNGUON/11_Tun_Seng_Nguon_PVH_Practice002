class BankAccount(private var balance: Double) {

    public fun deposit(amount: Double){
        if (amount > 0){
            balance += amount
        }else{
            println("Invalid amount")
        }
    }

    public fun withdraw(amount: Double){
        if (amount <= 0){
            println("Withdrawal must be positive.")
        }else if (amount > balance){
            println("Your balance is not enough to withdraw.")
        }else{
            balance -= amount
        }
    }
}