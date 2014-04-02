package zoo;

import java.util.HashMap;
import java.util.Date;

public class Zoo {
  // Zoo specific variables
  String name;
  String location;
  int nextCage;
  int nextTag;
  int nexteId;

  // Map to store animals present in the zoo
  HashMap<Integer, Animal> animalTags;

  // Map to store all employees in the zoo
  HashMap<Integer, Employee> employeeIds;

  public Zoo() {
    // Default values here
    nextCage = 0;
    nextTag = 0;
    nexteId = 0;
    animalTags = new HashMap<Integer, Animal>();
    employeeIds = new HashMap<Integer, Employee>();
  }

  public Zoo(String _name, String _location) {
    this();
    name = _name;
    location = _location;
  }

  // Zoo specific functions

  int getNextAvailableCage(LandAnimal a) {
    // Return next available cage for a particular type
    // of animal; dummy implementation shown; there can be more
    // than one animal in a cage;
    nextCage = nextCage + 1;
    return nextCage;
  }

  int getNextAvailableTag(Animal a) {
    // Return next available tag for a particular type
    // of animal; Implementation not shown
    nextTag = nextTag + 1;
    return nextTag;
  }

  int getNextAvailableEID(Employee e) {
    // Give an employee id based on type of employee;
    // Dummy implementation
    nexteId = nexteId + 1;
    return nexteId;
  }

  public void addAnimal(Animal a) {
    a.animalTag = getNextAvailableTag(a);
    a.entryDate = new Date();
    if(a instanceof LandAnimal) {
      LandAnimal lA = (LandAnimal) a;
      lA.cageNo = getNextAvailableCage(lA);
    }
    // Add to the animalTags map
    animalTags.put(a.animalTag, a);
  }

  public void addEmployee(Employee e) {
    e.eId = getNextAvailableEID(e);
    e.joiningDate = new Date();
    employeeIds.put(e.eId, e);
  }

  public Animal getAnimalByTag(int tag) {
    return animalTags.get(tag);
  }

  public Employee getEmployeeById(int eId) {
    return employeeIds.get(eId);
  }

  public void feedAnimal(Animal a) {
    // Scan through employee list and
    // find a suitable keeper
    // dummy implementation
    for (Employee e : employeeIds.values()) {
      if(e instanceof Keeper) {
        Keeper f = (Keeper) e;
        if(f.canFeed(a)) {
          f.feedAnimal(a);
          break;
        }
      }
    }
  }

  public void giveTicket(Visitor v) {
    // Look for a suitable clerk
    for (Employee e: employeeIds.values()) {
      if(e instanceof Clerk) {
        Clerk c = (Clerk) e;
        c.giveTicket(v);
        break;
      }
    }
  }

  public void doExit(Visitor v) {
    // Look for a suitable clerk
    for (Employee e: employeeIds.values()) {
      if(e instanceof Clerk) {
        Clerk c = (Clerk) e;
        c.doExit(v);
        break;
      }
    }
  }

  public void giveTour(Visitor v) {
    // Look for a suitable guide
    for (Employee e: employeeIds.values()) {
      if(e instanceof Guide) {
        Guide g = (Guide) e;
        g.giveTour(v);
        break;
      }
    }
  }
};
