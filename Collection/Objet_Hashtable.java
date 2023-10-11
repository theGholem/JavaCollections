package fr.Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/**
 * 
 * @apiNote Hashtable est un objet de Hashtable qui implemente l'interface Map. 
 * 
 * 
 * @author Konan
 *
 */
public class Objet_Hashtable {

	public static void main(String[] args) {
		
		System.out.println("\nTable de hachage 1 : ");
		Hashtable ht; //creation de notre objet de Hashtable
		ht=new Hashtable<>(); //instanciation de cet objet 
		
		/**
		 * 
		 * On utilise la methode ".put(cle(int), valeur)" pour ajouter une clé correspondante à une valeur
		 * 
		 * l'affichage commence toujour par la valeur dont la clé est la plus grande (si les clés sont des entiers denombrable)
		 */
		ht.put(1, "kobenan"); //pour la clé '1', on a la valeur associée 'kobenan'-->dernier a etre afficher : 1
		ht.put(32, 76);       //pour la clé '32', on a la valeur associée '76'-->premier a etre afficher : 32
		ht.put(2, "konan");
		ht.put(5, 35.3f);
		
		//Utilisation de l'objet Enumeration pour le parcour
		Enumeration e=ht.elements();

		//Affichage des element grace a une bouble while
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
		System.out.println("\nTable de hachage 2 : ");
		Hashtable ht2=new Hashtable<Integer, String>(); //la clé un entier, la valeur en caractere
		
		ht2.put(1, "A");
		ht2.put(2, "B");
		ht2.put(3, "C");
		ht2.put(4, "D");
		
		Enumeration e2=ht2.elements();
		
		while(e2.hasMoreElements())
			System.out.println(e2.nextElement());
		
		System.out.println("\nTable de hachage 3 : ");
		Hashtable ht3=new Hashtable<String, Integer>(); //la clé est une chaine de caractere, la valeur un entier
		                                                //Par contre ici l'affichage est aleatoire
		ht3.put("A", 1);
		ht3.put("B", 2);
		ht3.put("C", 3);
		ht3.put("D", 4);
		
		Enumeration e3=ht3.elements();
		
		while(e3.hasMoreElements())
			System.out.println(e3.nextElement());
		
	}

}
