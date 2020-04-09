package _02_sea_creature;

public class Sea_Creature_Runner {
public static void main(String[] args) {
	 SeaCreature shiv = new SeaCreature("shiv");
	 shiv.eat();
	 shiv.laugh();
	 SeaCreature Patrick = new SeaCreature("Patrick");
	 SeaCreature squidWard = new SeaCreature("squidWard");
	 squidWard.getName();
	 squidWard.eat();
	Patrick.getName();
	Patrick.eat();
	squidWard.laugh();
	Patrick.laugh();
}
}
