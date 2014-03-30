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
  int nextvisitorId;

  // Map to store animals present in the zoo
  HashMap<Integer, Animal> animalTags;

  // Map to store all employees in the zoo
  HashMap<Integer, Employee> employeeIds;

  public Zoo() {
    // Default values here
    nextCage = 0;
    nextTag = 0;
    nexteId = 0;
    nextvisitorId = 0;
    animalTags = new HashMap<Integer, Animal>();
    employeeIds = new HashMap<Integer, Employee>();
  }

  public Zoo(String _name, String _location) {
    this();
    name = _name;
    location = _location;
  }

  // Zoo specific functions

  public int getNextAvailableCage(Animal a) {
    // Return next available cage for a particular type
    // of animal; dummy implementation shown; there can be more
    // than one animal in a cage;
    nextCage = nextCage + 1;
    return nextCage;
  }

  public int getNextAvailableTag(Animal a) {
    // Return next available tag for a particular type
    // of animal; Implementation not shown
    nextTag = nextTag + 1;
    return nextTag;
  }

  public int getNextAvailableEID(Employee e) {
    // Give an employee id based on type of employee;
    // Dummy implementation
    nexteId = nexteId + 1;
    return nexteId;
  }

  public int getNextAvailableVisitorId(Visitor v) {
    // Dummy implementation
    nextvisitorId = nextvisitorId + 1;
    return nextvisitorId;
  }

  public void addAnimal(Animal a) {
    a.animalTag = getNextAvailableTag(a);
    a.cageNo = getNextAvailableCage(a);
    a.entryDate = new Date();
    // Add to the animalTags map
    animalTags.put(a.animalTag, a);
  }

  public void addEmployee(Employee e) {
    e.eId = getNextAvailableEID(e);
    e.joiningDate = new Date();
    employeeIds.put(e.eId, e);
  }

  public void addVisitor(Visitor v) {
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
};
