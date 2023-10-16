package fr.Exo6;

import java.util.ArrayList;

public class Cree_Une_Liste_De_Liste {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> listDeList=new ArrayList<>();
		
		ArrayList<Integer> sousList1=new ArrayList<>();
		ArrayList<Integer> sousList2=new ArrayList<>();
		ArrayList<Integer> sousList3=new ArrayList<>();
		ArrayList<Integer> sousList4=new ArrayList<>();
		
		sousList1.add(12);
		sousList1.add(19);
		sousList1.add(23);
		sousList1.add(12);
		
		sousList2.add(36);
		sousList2.add(5);
		sousList2.add(2);
		
		sousList3.add(89);
		sousList3.add(213);
		sousList3.add(34);
		sousList3.add(45);
		
		listDeList.add(sousList1);
		listDeList.add(sousList2);
		listDeList.add(sousList3);
		listDeList.add(sousList4);
		
		
		System.out.println("On a la liste de liste suivant :\n");
		for(ArrayList<Integer> cpt : listDeList)
			System.out.print(cpt+" ");
		
		System.out.println("La somme des elements a l'interieur de chaque sous-liste est :");
		int sum=0;
		for(ArrayList<Integer> cpt : listDeList) {
			
			for(int cpt2 : cpt)
				sum+=cpt2;
			
			System.out.println("total de la sous-liste : "+sum);
		}
		
			System.out.println("La sommes de tous les elements de nos 3 listes vaut :  ="+sum);
		
			
		

	}

}

