package projet1;

public class Class1 {

	public static void main(String[] args) {
		System.out.println("Notions sur System.out.println();");

		// La méthode: print suit l'objet: out qui suit la classe: System.
		// System est une classe unitaire, out est un objet gérant la sortie standard utilisée par system.
		// Print est la méthode qui affiche sur la console
		
		System.out.println("\nSystem est une classe unitaire qui gére les sorties et entrées standard.");
		System.out.println("Out est une méthode qui gére les sorties.");
		System.out.println("Print permet d'afficher sur la console.");
		
		System.out.println("\nOn peut faire des tabulations en collant \\t dans une String.");
		System.out.println("\\r permet de faire un retour chariot, ou retour à la ligne.");
		
		System.out.println("\nMaintenant concernant les variable. le type byte est bien pour les témpératures. Étant donné qu'il peut contenir entre -12 et 127.");
		System.out.println("Short lui est juste énorme: entre -32768 et 32767.");
		System.out.println("int lui permet d'aller déjà très loin. Mais si l'on souhaite faire péter les années lumières alors autant utiliser long.");
	
		System.out.println("Il faut retenir qu'un long, un float ou un double peut nécessiter l'ajout de L, f et d collé à la suite du nombre. Sinon il peut y avoir une erreur de compilation.");
		System.out.println("Double est juste un float avec plus de chiffres après le point.");
		System.out.println("Si tu cherches à user d'un char et non d'une String, alors ne pas oublier les guillemets simples.");
		System.out.println("Les classes commencent par une majuscule, les variables par une minuscule.");
		System.out.println("\nLes variables de String sont objets, cad qu'ils sont définis par une classe, ici String par exemple.");
		
		
	}

}
