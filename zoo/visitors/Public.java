package zoo;

public class Public extends Visitor {
  // General public
  public Public() {
    super();
  }

  public Public(String _name) {
    super(_name);
  }

  public void takePicture(Animal a) {
    // Allow public to take picture of few animals
  }
};
