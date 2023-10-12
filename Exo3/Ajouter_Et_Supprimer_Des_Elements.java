package fr.Exo3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Konan
 *
 */
public class Ajouter_Et_Supprimer_Des_Elements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String nameSupp;
		ArrayList<String>group=new ArrayList<>();
		
		try {
			
			//Quelques nom deja present dans notre liste
			
			group.add("etienne");
			group.add("chakoua");
			group.add("bachou");
			group.add("Kakudji");
			group.add("Kibwe");
			
			System.out.println("Combien de noms voulez vous ajouter a la liste svp");
			int n=sc.nextInt();
			
			sc.nextLine(); // Consommer la nouvelle ligne en attente
			
			System.out.println("Veuillez saisir les "+n+" noms a ajouter svp");
			
			for(int i=0;i<n;i++) {

				String name=sc.nextLine();
				group.add(name);
			}
			
			System.out.println("Vous avez la nouvelle liste de nom suivante :");
			
			//affichage de la liste presente avec les nouveau nom saisi par le User
			for(String cpt : group)
				System.out.print(cpt+" ");
				
			//reception du nom que le User aimerais retirer
			System.out.println("\nQuel nom voulez vous supprimer de la liste svp?");
			nameSupp=sc.nextLine();
				
				/**
				 * on utilise la methode " group.remove("a") " pour supprimer 'a' de la liste 'group'
				 */
				
				if(group.contains(nameSupp))
					group.remove(nameSupp);
				else
					System.out.println("Le nom que vous essayez de supprimer ne figure pas dans la liste");
				
			//Affichage de la liste mise à jour  de la liste			
			System.out.println("\nVoici la nouvelle liste mise a jour :");
			for(String cpt : group)
				System.out.print(cpt+" ");
			
		}catch(Exception e) {
			System.out.println("Une erreur c'est produite");
		}finally {
			sc.close();
		}
		
		
		

	}

}
