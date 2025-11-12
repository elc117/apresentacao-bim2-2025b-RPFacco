class AnimalRunner implements Runnable {
	private String name;

	public AnimalRunner (String name) {
		this.name = name;
	}

	private void runLikeName() {
		System.out.println(name + animalType() + " is going fast");
	}

	public String animalType() {
		return "animalType";
	}

	public void run() {
		System.out.println(name + animalType() + " is at the start of the race!");
		for (int pos = 10; pos > 0; pos--) {
			runLikeName();
			System.out.println(name + " is at position " + pos);
		}
		System.out.println(name + animalType() + " finished the race!");
	}
}

class Rabbit extends AnimalRunner {
	public Rabbit (String name) {
		super(name);
	}

	@Override
	public String animalType() {
		return " rabbit";
	}
}

class Turtle extends AnimalRunner {
	public Turtle (String name) {
		super(name);
	}

	@Override
	public String animalType() {
		return " turtle";
	}
}

class Fish extends AnimalRunner {
	public Fish (String name) {
		super(name);
	}

	@Override
	public String animalType() {
		return " fish";
	}
}

class BetterThreadRace {
	public static void main(String[] args) {
		Thread r = new Thread(new Rabbit("Snowball"));
		Thread t = new Thread(new Turtle("Donatello"));
		Thread f = new Thread(new Fish("Nemo"));
		r.start();
		t.start();
		f.start();
	}
}
