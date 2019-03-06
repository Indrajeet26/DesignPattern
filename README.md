# Java-DesignPattern


This repo will contain design DesignPattern examples.

1) **BUILDER PATTERN**

When there is a class with large number of parameters then initialising it in constructor increases complexity for client.
It becomes difficult for client to understand which constructor to use, if we write multiple constructor for combination of optional parameters.
The other option is we can generate getter and setter and then have default constructor with no args and then set all the parameters using that object. But problem with that is object might be in inconsistent state(if client wants 5 parameters and fails to set any of them) also we cannot attain immutability with this approach.

So to get the benefit of constructor and setter method we have builder pattern.
I will just give small explanation of what code(builder pattern is doing).

  - There is Employee class with 6 parameters as private and class as final to achieve immutable objects.
  - We have Parameterized employee constructor to assign all the parameters.
  - There is EmployeBuilder Class in which default values of parameters is set so that whenever object is build it will have those default values.
  - We have with methods for all the parameters which acts as a setter.
  - We have getter methods to get the values from Employee Class.
  - We also have build method which will construct new Object of Employee Class and will pass all the parameters.
  - Employee constructor is private so that it cannot be instantiated from client code. Only inner class can instantiate it.
  - Kindly refer EmployeeTest Class to see how it is used.
  - We have getEmployeeDetails methods which will have return type Employee and it is setting all the values which client      
      needs   

 Note:  Immutability is important for thread safety and we are achieving this by having all the class as final.
        On each build method new instance of Employee object will be created.
        
        In EmployeeBuilder Class I have set default values to parameters so that whenever new object is created it will atleast come with this default value and this comes very handy when implemnting builder pattern in testing.
        There are other methods of implementing it one of which is there in my previous commit.
        
