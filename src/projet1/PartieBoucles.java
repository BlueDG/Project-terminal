package projet1;

import java.util.Scanner;

public class PartieBoucles {

	public static void main(String[] args) {
		
		String prenom = null; // attribut prénom
		String reponse = "START"; // attribut réponse
		Scanner sc = new Scanner(System.in); // création du scan

		
		while (reponse.equals("START")) { // tant que la réponse donnée sera START
			
			System.out.println("Hello, my name is TALES.");
			System.out.println("What is your name?"); // on affiche
			prenom = sc.nextLine(); // on laisse une ligne ouverte pour récupérer le prenom donné par le user
			System.out.println("\nWelcome " +prenom+ ", how are you in this beautiful day?"); // on utilise ce qu'il a tapé pour lui parler
			System.out.println("Please type START to reboot / OFF to terminate / ON to load.");
			reponse = sc.nextLine();
			
			while (reponse.equals("OFF")) {
				
				System.out.println("Goodbye " +prenom+ ".");
				break;
			}
			
			while (!reponse.equals("START") && !reponse.equals("OFF") && !reponse.equals("ON")) {
				
				System.out.println("\nKey " +reponse+ " unknown to the system.");
				System.out.println("Please type OFF to terminate ... "); // on demande si l'on redemarre la boucle
				reponse = sc.nextLine(); // on laisse une ligne ouverte pour récupérer la réponse donnée par le user
			}
		}
		
		while (reponse.equals("OFF")) {
			
			System.out.println("\nGoodbye " +prenom+ " and thank you for your understanding.");
			break;
		}
		
		if (reponse.equals("ON")) {
			
			
			for(int i = 1; i <= 8; i++) {
				
				System.out.println("Loading file " +i);
				
			}
			
			System.out.println("\nFiles loaded.");
			System.out.println("Ready to terminate.");
			System.out.println("\nPlease type OFF to terminate.");
			reponse = sc.nextLine();
		}
		
			if (reponse.equals("OFF")) {
				
				System.out.println("\nThank you " +prenom+ ".");
			
			}
				
			while (!reponse.equals("START") && !reponse.equals("OFF") && !reponse.equals("ON")) {
				
				System.out.println("\nKey " +reponse+ " unknown to the system.");
				System.out.println("Please type OFF to terminate ... "); // on demande si l'on redemarre la boucle
				reponse = sc.nextLine(); // on laisse une ligne ouverte pour récupérer la réponse donnée par le user
			}
		
		
			while (reponse.equals("OFF")) {
			
			System.out.println("\nGoodbye " +prenom+ ".");
			break;
			}
		
		}
	}

