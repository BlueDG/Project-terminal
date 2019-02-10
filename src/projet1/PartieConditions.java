package projet1;

import java.util.Scanner;

public class PartieConditions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un numéro entre 0 et 10.");
		int i = sc.nextInt();
		
		if (i < 0)
			System.out.println("Ce numéro est inférieur à 0 ...");
			
		else if (i > 10)
			System.out.println("Ce numéro est au dessus de 10 ...");
		
		else
			System.out.println("Vous avez saisi : " + i);
		
	}
	
}
