package bouteilles;

public class Main {

	public static void main(String[] args) {
		
		Bouteille bouteille1 = new Bouteille();
		
		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, true, "H2O");
		
		Bouteille bouteille3 = new Bouteille(bouteille2);
		
		float contenanceEnCLDeBouteille2 = bouteille2.donneContenanceEnCL();
		
		System.out.println(bouteille2.estPleine());
		
		System.out.println(bouteille2.fermeture());
		
		System.out.println(bouteille2.ouverture());
		


		
		

	}

}
