package _03_smurf;


public class Smurf_Runner {
	 public static void main(String[] args) { 
		 
	Smurf handySmurf = new Smurf("handySmurf");
	Smurf papaSmurf = new Smurf("papaSmurf");
	Smurf Smurfette = new Smurf("Smurfette");
	
	System.out.println(handySmurf.getName());
	handySmurf.eat();
	System.out.println(papaSmurf.getName());
	System.out.println(papaSmurf.getHatColor());
	System.out.println(papaSmurf.isGirlOrBoy());
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
}
}
