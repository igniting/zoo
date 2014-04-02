import zoo.*;

public class Main {
  public static void main(String[] args) {
    // Example depicting sample usage
    Zoo iitk = new Zoo("uniqueZoo", "Kanpur");
    Tiger t = new Tiger();
    iitk.addAnimal(t);
    Keeper k = new Keeper("Tom");
    iitk.addEmployee(k);
    iitk.feedAnimal(t);
    Guide g = new Guide("Harry");
    iitk.addEmployee(g);
    Public p = new Public("Ron");
    iitk.giveTicket(p);
    p.takePicture(t);
    iitk.doExit(p);
  }
};
