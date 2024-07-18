
// Function to add (sum) integers starting at 1 up to a specified maximum
fun sumIntegers(max: Int): Int {
    var sum = 0
    for (i in 1..max) {
        sum += i
    }
    return sum
}

// Iterative function to find the factorial of a specified integer
fun factorialIterative(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

// Lambda expression to find the factorial of a specified integer
val factorialLambda: (Int) -> Int = { n ->
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    result
}

// Recursive function to find the factorial of a specified integer
fun factorialRecursive(n: Int): Int {
    return if (n == 1) 1 else n * factorialRecursive(n - 1)
}

fun main() {
    // Example usage of sumIntegers function
    println("Sum of integers from 1 to 10: ${sumIntegers(10)}")

    // Example usage of factorialIterative function
    println("Factorial of 5 (iterative): ${factorialIterative(5)}")

    // Example usage of factorialLambda function
    println("Factorial of 5 (lambda): ${factorialLambda(5)}")

    // Example usage of factorialRecursive function
    println("Factorial of 5 (recursive): ${factorialRecursive(5)}")
}
