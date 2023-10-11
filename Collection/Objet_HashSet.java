package fr.Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author Konan
 *
 */
public class Objet_HashSet {

	public static void main(String[] args) {
	
		
		try {
			
			System.out.println("\nParcour de notre collection via un iterateur ");
			HashSet hs;
			hs=new HashSet<>();
			
			hs.add("KALOU");
			hs.add(32);
			hs.add("KIRIKOU");
			hs.add(8.79d);
			
			//Parcour de notre Set via un iterateur. Avec le HashSet, on utilise 'Iterator' et non 'ListIerator'
			Iterator li=hs.iterator();
			while(li.hasNext())
				System.out.println(li.next());
			
			System.out.println("\nParcour de notre collection via un tableau d'Objet ");
			
			Object[]obj;//Declaration de notre tableau d'objet
			obj=hs.toArray();
			//Parcour des elements de notre collection via un tableau
			for(Object o : obj)
				System.out.println(o);
			
			
			
		}catch(Exception e){
			System.out.checkError();
		}
		

	}

}
