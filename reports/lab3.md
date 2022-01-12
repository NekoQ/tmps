# Behavioral Design Patterns


## Author: Marius Bitca

----

## Objectives:

* Get familiar with the Behavioral DPs;
* Choose a specific domain;
* Implement at least 1 BDPs for the specific domain;


## Used Design Patterns:

* Observer


## Implementation

To show the Observer behavioral pattern I created the secretary class that will be notified when the principal creates a report:
```java
public class Secretary extends Worker {
    public void notify(String event) {
        System.out.println("Secretary notified");
    }
}
```
Here we have the secretary class that has just a method to get notified when an event happens.
Next I created an EventManager to handle all the listeners and to notify all of them when needed;
```java
public class EventManager {
    ArrayList<Secretary> listeners = new ArrayList<>();

    public void subscribe(Secretary secretary) {
        listeners.add(secretary);
    }

    public void unsubscribe(Secretary secretary) {
        listeners.remove(secretary);
    }

    public void notify(String report) {
        for (Secretary secretary: listeners) {
            secretary.notify(report);
        }
    }
}
```
And the final step is to reference an EventManager in the principal class and call the notify funciton when the principal sends a report.
```java
public EventManager events;

public String sendReport(String report) {
    events.notify(report);
    return "Sent \"" + report + "\" successfully";
}
```
