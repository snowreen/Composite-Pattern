I have implemented composite pattern here and I have used Manager-Subordinates relationship. The leaf node here is Developer.

#Why

A manager can have other managers under him/her and also the lowest level manager will have developers under him/her.
To represent the relationship I have used composite design pattern.

#Implementation

Manager and Developer both implements Employee interface. But Developer is the leaf node, so it doesn't have any subordinates.
Manager is the composite class and can have other employees (managers and developers). Manager class implements all the methods from Employee interface. 

Developer class has implementation of only getName(), getSalary() and print() methods. Other methods should be empty in this class as it doesn't deal with subordinates.

Main class has main method to test this implementation.