package fr.Exo5;

import java.util.LinkedList;
import java.util.Scanner;

public class Utilisation_De_LinkedList {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		LinkedList<String>group=new LinkedList<>(); //Instanciation de notre objet group
		
		//On ajoute a notre collection 'group' des noms de ville 
		group.add("Paris");
		group.add("Berlin");
		group.add("Ottawa");
		group.add("Casablanca");
		
		System.out.println("Voici initialement la liste que vous avez :");
		System.out.println(group); //Affiche la liste qu'on a initialement
		
		System.out.println("Veuillez saisir le nom de ville qui sera en premier sur la liste");
		String nameCity=sc.nextLine();//Recuperation du nom d'ajout saisi par le user
		
		/**
		 * 
		 * on utilise la fonction ' group.addFirst(element) ' pour ajouter un element en tete de la liste 'group'
		 * analogiquement on utilise ' addLast() '
		 * 
		 */
		group.addFirst(nameCity);
		
		System.out.println("Vous avez la nouvelle liste suivante :");
		System.out.println(group);
		
		System.out.println("On a maintenant retirer le dernier nom de ville sur la liste :");
		
		/**
		 * 
		 * ' group.removeLast(element) ' permet de retirer le dernier element de group
		 * ' group.removeFirst(element) ' permet de retirer le premier element 
		 */
		group.removeLast();
		
		System.out.println("Vous avez la nouvelle liste mise a jour suivante :");
		System.out.println(group);

	}

}
