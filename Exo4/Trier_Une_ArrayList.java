package fr.Exo4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Konan
 *
 */
public class Trier_Une_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer>group=new ArrayList<>();
		
		//Ajout d'elements non ordonné dans notre liste
		group.add(26);
		group.add(10);
		group.add(7);
		group.add(34);
		group.add(67);
		group.add(12);
		group.add(10);
		group.add(39);
		
		
		/*for(int i=0;i<=10;i++)
			group.add(i);
		System.out.println("Vous avez la liste :");
      */
		
		//Affichage de notre liste non ordonné
		System.out.println(group);
		
		System.out.println("Voici rangez dans l'ordre croissant vos elements :");
		
		/**
		 * la fonction " Collections.sort(group) " : permet de trier dans un ordre croissant les elements de 'group'
		 */
		Collections.sort(group);
		//Affichage de la nouvelle liste ordonné selon un ordre croissant
		System.out.println(group);
		
		System.out.println("Voici rangez dans l'ordre decroissant vos elements :");
		
		/**
		 * la fonction " Collections.reverse(group) " : permet de trier dans un ordre décroissant les elements de 'group'
		 */
		Collections.reverse(group);
		//Affichage de la nouvelle liste ordonné selon un ordre croissant
		System.out.println(group);
		
	}

}
