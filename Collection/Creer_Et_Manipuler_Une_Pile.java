package fr.Collection;

import java.util.Stack;

/**
 * 
 * @author Konan
 *
 */
public class Creer_Et_Manipuler_Une_Pile {

	public static void main(String[] args) {
		
		Stack pileElements; //Declaration de notre pile via l'objet "Stack<>();"
		
		pileElements=new Stack<Integer>();//Initialisation de notre objet
		
		//Affichage de la pile pour commencer(celle ci est au depart vide)
		System.out.println("On a une pile vide au depart");
		displayPile(pileElements);
		
		//On ajoute a notre pile vierge un premier element grace à la methode ".push(CeQuonAjoute)". Ici on ajoute '2'
		System.out.println("On ajoute le premier element");
		pileElements.push(2); //Ajout ici
		displayPile(pileElements);//On affiche en meme temps notre pile qui contient maintenant cet element
		
		//On ajoute un autre elements à notre pile, toujour du type Interger car on a precisé lor de la declaration
		System.out.println("On ajoute deuxieme element");
		pileElements.push(5); //Ajout ici
		displayPile(pileElements);//On affiche en meme temps notre pile qui contient maintenant cet element en plus
		
		System.out.println("On ajoute le troiseieme element");
		pileElements.push(8);
		displayPile(pileElements);
		
		
		//On retire a notre pile vierge le dernier element ajouté grace à la methode ".pop()"sans parametre. 
		System.out.println("On retire en premier le dernier elements de la pile");
		pileElements.pop(); //Retrait ici
		displayPile(pileElements);//affichage de la nouvelle liste sans le dernier element rajouté
		
		//On retire a notre pile vierge le dernier element present sur la liste  
		System.out.println("On retire ensuite le dernier elements present de la pile");
		pileElements.pop(); //retrait ici
		displayPile(pileElements); //Affichage ici
		
		System.out.println("On retire ensuite le dernier elements present de la pile");
		pileElements.pop();
		displayPile(pileElements);
		
		
		
		

	}
	
	/**
	 * 
	 * @param element
	 */
	private static void  displayPile(Stack<Integer> element) {
		
		System.out.println(element); //Permet d'afficher les elements d'une pile
	}
	

}
