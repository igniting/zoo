package zoo;

public class Media extends Visitor {
  // Media/Movie makers. They need special permissions
  public Media() {
    super();
  }

  public Media(String _name) {
    super(_name);
  }

  public void takeInterview(Employee e) {
    // Take interview of an employee
  }

  public void makeVideo(Animal[] animals) {
    // Allow to make video of various animal
  }
};
