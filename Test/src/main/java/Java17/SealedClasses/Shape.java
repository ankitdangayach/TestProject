package Java17.SealedClasses;


/*Sealing allows classes and interfaces to define their permitted subtypes. In other words, a class or interface
can define which classes can implement or extend it. It’s a useful feature for domain modeling, and increasing the security of libraries.*/


/*An alternate purpose of a class hierarchy can be to model various possibilities that exist in a domain.
As an example, imagine a business domain that only works with cars and trucks, not motorcycles. When creating the Vehicle abstract class
in Java, we should be able to allow only Car and Truck classes to extend it. As such, we want to ensure that there will be no misuse of the Vehicle
        abstract class within our domain.*/

public sealed class Shape permits Circle, Square, Triangle {

}

non-sealed class Circle extends Shape {

}

non-sealed class Square extends Shape {

}

non-sealed class Triangle extends Shape {

}



