In shape calculator class problem is if we want to add new shape we need to modify class i.e
the calculateArea and calculateParameter, which is violating
Open closed principle -which says:: open for extension closed for modification
 software entity should be such that you can introduce new functionality or behavior without modifying
 the existing code since changing the existing code might introduce bugs.

 To improve we can create a abstract class shape
 with abstract method calculate area and parameter and then different shapes can extend it

  shapes that implements the Shape interface, allowing for easy extensibility.
