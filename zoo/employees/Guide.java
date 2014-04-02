package zoo;

public class Guide extends Employee {
  public Guide() {
    super();
  }

  public Guide(String _name) {
    super(_name);
  }

  void giveTour(Visitor v) {
    // Give tour of zoo to visitor
  }
};
