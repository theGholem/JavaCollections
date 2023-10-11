package fr.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @apiNote Arraylist est un objet qui impelemte l'interface List. 
 *          On va creer un objet List et l'implementer avec une liste chainee(LinkedList)
 * 
 * 
 * @author Konan
 *
 */
public class Objet_ArrayList {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("\nPremiere List : ");
			List maList;
			maList=new ArrayList<>();
			maList.add("Bonjour");
			maList.add(36);
			maList.add(30.09f);
			
			ListIterator li=maList.listIterator();
			
			while(li.hasNext())
				System.out.println(li.next());
			
			
			System.out.println("\nList d'entier : ");
			ArrayList listEntier=new ArrayList<Integer>();
			listEntier.add(29);
			listEntier.add(352);
			listEntier.add(67);
			listEntier.add(297);
			
			for(int i=0;i<listEntier.size();i++)
				System.out.println("indice "+i+" : "+listEntier.get(i));
			
			System.out.println("\nList de caractere : ");
			ArrayList listCarac=new ArrayList<String>();
			listCarac.add("toto");
			listCarac.add("tutu");
			
			System.out.println("Nous somme a la dans notre liste :"+listCarac);
			
			listCarac.add("titi");
			listCarac.add("tata");
			
			for(int i=0;i<listCarac.size();i++)
				System.out.println("indice "+i+" : "+listCarac.get(i));
			
			
			
		}catch(Exception e) {
			System.out.checkError();
		}
		
		

	}

}
