# Creational Design Patterns


## Author: Marius Bitca

----

## Objectives:

* Study and understand the Structural Design Patterns.
* As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.
* Implement some additional functionalities using structural design patterns.


## Used Design Patterns:

* Composite
* Decorator
* Facade 


## Implementation

### Composite

Composite is a great structural design pattern to compose objects into a tree structure and work with it as if it was a singular object.

To present this design pattern I implemented the following workers tree:
```                      
             Worker
         /     |     \
    Teacher Principal SecurityGuard
    /     \   
 Primary Middle
```
Next I created a staff class that will be composed of workers. In this way it can be calculated, for example the salary of all the workers or give a salary increase for a group of workers or for a single worker.
```java
public class Staff extends Worker {
    protected List<Worker> workers = new ArrayList<>();
    
    public void addWorker(Worker worker) {
        workers.add(worker);
    }
    
    public int getSalary() {
        int salary = 0;
        for (Worker worker : workers) {
            salary += worker.getSalary();
        }
        return salary;
    }
}
```
### Decorator
Decorator is a structural pattern that allows adding new behaviors to objects dynamically by placing them inside special wrapper objects.

If we do not want to modify our initial Staff class it can be created a decorator to add new functionality.
In this specific case I wanted to add a method that will decrease the salary of all the workers from the Staff.
To achieve this I created a decorator that extends the Staff class and implements the new function.
```java
public class StaffDecorator extends Staff {
    public StaffDecorator(Staff staff) {
        super();
    }

    public void decreaseSalary(int percent) {
        for (Worker worker: workers) {
            worker.setSalary(worker.getSalary() * percent / 100);
        }
    }
}
```
### Facade
Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

To implement this structural pattern I created some methods for the SecurityGuard, that consist of checking if a Student is part of the school database.
First we have the SecurityGuard methods:
```java
public class SecurityGuard extends Worker {
    public int salary = 200;

    public Student studentByID(int ID) {
        Student student = new Student();
        return student;
    }

    public boolean checkName(Student student, String name) {
        return true;
    }

    public boolean checkPhoto(Student student, String photo) {
        return true;
    }
    public boolean checkAddress(Student student, String address) {
        return true;
    }
}
```

Next, to simplify the checking process we can create a facade for this sequence of functions:
```java
public class SecurityGuardFacade {
    protected SecurityGuard guard;
    public SecurityGuardFacade(SecurityGuard guard) {
        this.guard = guard;
    }
    public boolean checkStudent(int id, String name, String photo, String address) {
        Student student = guard.studentByID(id);
        boolean nameBool = guard.checkName(student, name);
        boolean photoBool = guard.checkPhoto(student, photo);
        boolean addressBool = guard.checkAddress(student, address);

        return (nameBool && photoBool && addressBool);

    }
}
```
Now we can easily call the checkStudent method with the student id, receive the student info from the database and check all the needed information.
