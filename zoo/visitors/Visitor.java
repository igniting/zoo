package zoo;

import java.util.Date;

public class Visitor {
  String name;
  int ticket;
  Date entryTime;
  Date exitTime;

  public Visitor() {
    // Default values here
  }

  public Visitor(String _name) {
    name = _name;
  }
};
