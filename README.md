# Java-Programs
This repository contain Java programs. </br>
****1. Bank_admin_menu :**** This file contain the Demonstration of Command lineBased java programming </br>
a.Declaration of variable and initialization </br>
b.conditional and iterative statement - If, else, for, While </br>
c.strings </br>
d.Arrays </br>
e.Getting user input through Java Stream Classes.</br>

****2. Mark :**** The code demonstrates basic object-oriented programming concepts, such as classes, constructors, instance variables, methods, and method overloading in Java.</br>
      The provided code defines two classes, **Marksheet** and **Mark**. </br> The **Marksheet** class represents a student's marks and details, and the **Mark** class contains the **main** method to create instances of the **Marksheet** class and demonstrate its usage.</br></br></br>
****3. Multilevel_Inheritence :**** This Java code demonstrates the concept of multilevel inheritance, which is a type of inheritance where a derived class inherits from a base class, and then another class inherits from this derived class. In this example, we have three classes: **SuperClassAnimal**, **DerivedClassDog**, and **Cat**.
             **SuperClassAnimal:** This is the base class that represents an animal. It has a single member variable name, which stores the name of the animal. It also has a constructor **SuperClassAnimal(String name)** to initialize the **name**, and a method **run()** that prints a message indicating that the animal habit is running most of the time.
             **DerivedClassDog:** This class is derived from **SuperClassAnimal**. It adds an additional member variable **type**, which stores the type of the dog (e.g., "pet" in this case). It has a constructor **DerivedClassDog(String name, String type)** that first calls the constructor of the base class using **super(name)** to initialize the **name**, and then sets the **type**. It also defines two methods: **eats()**, which prints a message stating that the dog can eat both veg and non-veg food, and print(), which prints the animal type.
             **Cat:** This class is derived from **DerivedClassDog**, which means it inherits from **DerivedClassDog**. It adds an additional member variable **family**, which stores the family of the cat (e.g., "Town_tiger" in this case). It has a constructor **Cat(String name, String type, String family)** that first calls the constructor of the derived class using **super(name, type)** to initialize the **name** and **type**, and then sets the **family**. It also defines a method **roar()** that prints a message stating that the cat roars like **"meow"**.
