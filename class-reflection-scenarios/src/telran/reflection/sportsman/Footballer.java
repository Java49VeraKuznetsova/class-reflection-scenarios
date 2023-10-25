package telran.reflection.sportsman;



public class Footballer implements Sportsman {
	String team;
	
	public Footballer(String team) {
		super();
		this.team = team;
	}

	@Override
	public void action() {
		System.out.printf("I'm playing football for %s team", team);

	}

}
