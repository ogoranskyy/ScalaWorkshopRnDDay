import TranslationConversion.TranslatedString

object Main {
   def main(args: Array[String]): Unit = {
      println("Hello world");
      println("cat".translate("de"))
      val myCat = Cat("Boots",2)
      def printMyCat(printer: Printer[Cat]) = {
         printer.print(myCat)
      }

      val catPrinter: Printer[Cat] = new CatPrinter
      val animalPrinter: Printer[Animal] = new AnimalPrinter

      printMyCat(catPrinter)
      printMyCat(animalPrinter)

   }


   def printAnimals(animals: List[Animal]) = {
      animals.foreach {
         animal => println(animal)
      }
   }
}

trait Animal {
   def name: String
}
trait Mammal extends Animal {
   def age: Int
}
case class Cat(name: String, age: Int) extends Mammal
case class Dog(name: String, age: Int) extends Mammal

abstract class Printer[-A] {
   def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
   def print(animal: Animal): Unit =
      println("The animal's name is: " + animal.name)
}

class CatPrinter extends Printer[Cat] {
   def print(cat: Cat): Unit =
      println("The cat's name is: " + cat.name)
}