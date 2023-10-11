package fr.Exo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Rechercher_Dans_Une_ArrayList {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		
		int numberVerif;
		char rps=' ';
		ArrayList<Integer>group=new ArrayList<>();
		
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
			
			
			//Cette boucle permet au User de reessayer autant de fois qu'il le veut
			do {
				
				//Recherche d'un nombre dans notre liste
				System.out.println("\n\nQuel entier aimerez vous verifier svp ");
				numberVerif=sc.nextInt();
				
				/**
				 * La methode " E.contains(a) " permet de verifier que 'a' est contenu dans l'ensemble 'E'
				 * 
				 */
				if(group.contains(numberVerif))
					System.out.println("Bravo !\n'"+numberVerif+"' appartient a la liste");
				else System.out.println("Desole !\n'"+numberVerif+"' n'appartient pas la liste");
						
				sc.nextLine(); //Vide notre scanner pour la suite
				
				//Cette boucle guide le User afin que il dise s'il veut recommencer ou pas
				//S'il ne saisi pas O ou N , alors on recommence l,action de lui demander ce qu'il veux
				do {
					
					if(rps!='O' && rps!='N')
						System.out.println("Vous devez saisir 'O' pour OUI et 'N' pour NON svp");
					
					System.out.println("Voulez vous reessayer?(O/N)");
					rps=sc.nextLine().charAt(0);
					
				}while(rps!='O' && rps!='N');
				
				
			}while(rps=='O');
			
			System.out.println("Merci et aurevoir!");
			
		}catch(Exception e ) {
			System.out.println("Une erreur s'est produite");
		}finally {
			sc.close();
		}
		

	}

}
