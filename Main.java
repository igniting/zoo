import zoo.Zoo;
import zoo.Tiger;
import zoo.Keeper;

public class Main {
  public static void main(String[] args) {
    Zoo iitk = new Zoo("uniqueZoo", "Kanpur");
    Tiger t = new Tiger();
    iitk.addAnimal(t);
    Keeper k = new Keeper("Tom");
    iitk.addEmployee(k);
    iitk.feedAnimal(t);
  }
};
