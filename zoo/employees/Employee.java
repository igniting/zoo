package zoo;

import java.util.Date;

public abstract class Employee {
  String name;
  int eId;
  Date joiningDate;

  public Employee() {
    // Default values here
  }

  public Employee(String _name) {
    name = _name;
  }
};
