package fr.Collection;

import java.util.List;          //import notre bibliotheque List
import java.util.LinkedList;    //import notre bibliotheque LinkedList
import java.util.ListIterator;  // import la bibliotheque ListIterator 



/**
 * 
 * @apiNote LinkedList est un objet qui impelemte l'interface List. 
 *          On va creer un objet List et l'implementer avec une liste chainee(LinkedList)
 * 
 * 
 * @author Konan
 *
 */
public class Objet_LinkedList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		try {
			
			
			//Creation de notre objet List
			List maList;
			
			//Instantiation de notre objet List via une list chainée
			maList=new LinkedList<>();
			
			//On va maintenant utiliser la methode ".add()" pour ajouter des elements dans notre list chainée
			maList.add(12);     //on ajoute 12
			maList.add("TOTO"); //on ajoute un String 
			maList.add(20.76f); //on ajoute un float
			
			/*
			 * Pour afficher les elements de notre list, on vas utiliser la bouble for() et la methode ".get()" 
			 * qui va permettre de recuperer des elements souhaiter
			 * 
			 * on va egalement utiliser la methode ".size()" pour connaitre la taille exacte de notre List
			 * 
			 */
			System.out.println("\nAffichage des elements de notre list via une boucle for ");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<maList.size();i++)
				//Affiche l'indice(indice qui commence toujour à 0 pour les List) , et affiche l'element correspondant
				System.out.println("L'element à l'indice "+i+" de notre liste est :"+maList.get(i));
			
			System.out.println("-----------------------------------------------------\n");
			
			
			
			/*
			 *Pour afficher les elements de notre list, on peut aussi  utiliser un iterateur (Iterator) via l'interface "Iterator"
			 *'ListIterator' est un objet qui implemente l'interface "Iterator". Son unique role est de parcourir les collecrions
			 *Pour itérer sur une list, on utilise la methode '.listIterator()'
			 *  
			 *on va egalement utiliser la boucle while() pour afficher chacun des elements de notre list
			 * 
			 */
			System.out.println("Affichage des elements de notre list via un iterator ");
			System.out.println("-----------------------------------------------------");
			ListIterator li=maList.listIterator();
			
			/**
			 * 
			 * la boucle while() permet de parcourir notre collection
			 * la methode ".hasNext()" verifie à chaqe fois s'il y a un suivant et 
			 * la methode ".next()" affichele suivant de la list
			 * 
			 */
			while(li.hasNext())
				System.out.println(li.next());
			
			System.out.println("-----------------------------------------------------");
			
			
		}catch(Exception e) {
			
			/**
			 * 
			 * la methode ".checkError()" inspect si une erreur s'est produite au niveau du "System.out" 
			 * et renvoit 'true' si oui, et 'false' sinon
			 */
			System.out.checkError();
		}
		
	}

}
