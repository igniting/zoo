package zoo;

import java.util.Date;

public abstract class Animal {
  // Zoo specific information to identify animal
  protected int animalTag;
  protected Date entryDate;
  protected int age;

  // Constructors
  public Animal() {
    // At time of creation, animal is not part of zoo.
  }

  // Animal specific functions
  public abstract String getSpecies();
  public abstract String getGenus();
};
