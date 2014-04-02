package zoo;

import java.util.Date;

public class Clerk extends Employee {
  public Clerk() {
    super();
  }

  public Clerk(String _name) {
    super(_name);
  }

  void giveTicket(Visitor v) {
    // Give ticket to a visitor based on the type of the visitor
    // v.ticket = some appropriate value
    v.entryTime = new Date();
  }

  void doExit(Visitor v) {
    // Invalidate the ticket
    v.exitTime = new Date();
  }
};
