package zoo;

public class Keeper extends Employee {
	public Keeper() {
		super();
	}

	public Keeper(String _name) {
		super(_name);
	}

	public boolean canFeed(Animal a) {
		// check if the keeper can feed this animal
		// dummy implementation
		return true;
	}

	public void feedAnimal(Animal a) {
		if(canFeed(a)) {
			// Give food to animal
		}
		else {
			throw new RuntimeException("I cann't feed this animal!");
		}
	}

	public void cleanCage(int cageNo) {
		// Clean cage with cage number cageNo
	}
};
