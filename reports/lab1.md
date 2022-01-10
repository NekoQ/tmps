# Creational Design Patterns


## Author: Marius Bitca

----

## Objectives:

* Get familiar with the Creational DPs;
* Choose a specific domain;
* Implement at least 3 CDPs for the specific domain;


## Used Design Patterns: 

* Builder
* Factory Method
* Singleton


## Implementation

* To better show the idea of these design patterns I took as my topic school. 
* The builder was used to create rooms in which we have many parameters as: number of seats, the room number, the tools in this room, etc.
```cpp
  RoomBuilder builder;

  builder.setRoomNumber(25);
  builder.setSeatsNumber(50);
  builder.setSubject("Chemistry");
  builder.addTool("Microscope");
  builder.addTool("Flask");

  Room *room = builder.build();
```
* The factory method was used to have an unique place where all the school instances are created.
```cpp
  Factory *factory = new PrimarySchoolFactory();

  School *school = factory->Create();
```
* The singletone was used to simulate the principal of the school, because there can be just one principal for a school.
```cpp
  Principal *principal = Principal::GetInstance();

  std::string response = principal->sendReport("test");
```

## Conclusions
While implementing this laboratory work, I understood how much creational design patterns make the whole system more flexible.
From here comes the conclusion that to develop viable and reusebale code the use of design patterns is mandatory.
