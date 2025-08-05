package com.example.simpleapp.programs

class MyClass {
    // This property will be initialized only when it's first accessed.
    val expensiveProperty: String by lazy {
        println("Computing expensiveProperty...")
        // Simulate some time-consuming operation
        Thread.sleep(1000)
        "Hello from expensiveProperty!"
    }

    fun useProperty() {
        println("Before accessing expensiveProperty for the first time.")
        //println(expensiveProperty) // "Computing expensiveProperty..." will be printed here
        println("Accessed expensiveProperty.")
        //println(expensiveProperty) // "Computing expensiveProperty..." will NOT be printed again
    }
}

fun main() {
    val myInstance = MyClass()

    println("MyClass instance created.")
    // At this point, expensiveProperty has not been initialized yet.

    myInstance.useProperty()

    println("Accessing expensiveProperty directly:")
    println(myInstance.expensiveProperty) // "Computing expensiveProperty..." will NOT be printed again

    // You can also use lazy with non-class properties
    val lazyValue: Int by lazy {
        println("Initializing lazyValue")
        42
    }
    println("Before accessing lazyValue")
    println(lazyValue) // "Initializing lazyValue" will be printed
    println(lazyValue) // "Initializing lazyValue" will NOT be printed

    //My lazy
    startCar()
}

fun startCar() {
    val isPetrolAvailable: Boolean by lazy {
        println("Petrol is available, starting the Car...")
        true
    }

    println(isPetrolAvailable)
}