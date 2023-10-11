package fr.Exo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Konan
 *
 */
public class Creer_Et_Parcourir_Une_ArrayList {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer>group=new ArrayList<>();
		/*
		 * 
		 * 
		 *group.add(1);
		 *group.add(2);
		 * group.add(3);
		 *group.add(4);
		 *group.add(5);
		 *group.add(6);
		 *group.add(7);
		 *group.add(8);
		 *group.add(9);
		 *group.add(10);
		 *
         * On peut ajouter les elements 1 par 1, mais s'il s'agit de plusieurs
		 * element cela peut etre long, donc on va utiliser une boucle 
		 * pour ajouter les elements
		 * 
		
		*/
		
		try {
			System.out.println("Combien d'entier voulez vous saisi ?");
			int entier=sc.nextInt();
			
			System.out.println("Veuillez saisir les "+entier+" svp");
			
			//Boucle pour ajouter nos 10 elements à notre liste
			for(int i=0;i<entier;i++) {
				int n=sc.nextInt();
				group.add(n);
			}		
			
			System.out.println("Vous avez saisi la liste suivante : ");
			//Boucle pour afficher nos 10 elements
			for(Integer cpt : group)
				System.out.print(cpt+" ");
			
		}catch(Exception e ) {
			System.out.println("Une erreur s'est produite");
		}finally {
			sc.close();
		}
		

		
		
		
	}

}
