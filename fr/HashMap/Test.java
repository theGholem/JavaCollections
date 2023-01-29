import java.util.HashMap;

import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * 
 * @author oem
 * @since  28/01/2023
 * 
 * 
 * @apiNote PAS DE DOUBLONS (Sauf valeurs),PAS THREAD-SAFE,ACCÈS DIRECT,
 *          VALEUR NULLE(Accepte jusqu'à 1 seule clé nulle, et eventuellement plusieurs valeurs nulle);
 */
public class Test{
    public static void main(String[]args) throws Exception {

        /**
         * On precisera pour ce type de collection les types de donnée(natif) 
         * de nos couple clés/Valeurs
         */

        HashMap<String,String> hm=new HashMap<String,String>();

        /**
         * 
         * On utilise la methode ".put()" pour ajouter des couples clés/Valeurs
         * on utilise la methode ".get()" pour obtenir une valeur corespondante à une clé 
         */

        hm.put("1","Ali");
        hm.put("15","Julie");
        hm.put("7","Paul");
        hm.put("9","Kamado");
        hm.put("0","Doma");

        System.out.println(hm.get("1")); //nous renvoit la valeur correspondante à cette clé -->Ali
        System.out.println(hm.get("15")); //nous renvoit la valeur correspondante à cette clé -->Julie
        System.out.println(hm.get("7")); //nous renvoit la valeur correspondante à cette clé -->Paul
        System.out.println(hm.get("9")); //nous renvoit la valeur correspondante à cette clé -->Kamado
        System.out.println(hm.get("0")); //nous renvoit la valeur correspondante à cette clé -->Doma


        /**
         * 
         * On utilise la methode ".ContainsValue()" pour verifier si une valeur est presente dans la 
         * collection
         * 
         */

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("\nVeuillez saisir un elements de la collection svp");
        String elmt=br.readLine();

        if(hm.containsValue(elmt)){

            System.out.println("Trouvée, l'element saisie appartient bien à notre collection");
        }else{
            System.out.println("Desolé, il n'existe aucun élements de ce nom dans notre collection");
        }

        /**
         * 
         * on veut maintenant parcourir toute notre collection, on veut afficher les couples 
         * clés/Valeurs soud forme d'ensemble.
         * 
         * pour ce faire, on utilisera une boucle for, mais surtout la methode ".KeySet()" qui 
         * s'occupera de retourner les clés sous forme d'ensemble
         * 
         * NB : Ici notre compteur sera un String, vu que c'est ce qu'on a déclaré
         * 
         */


         System.out.println("\nVoici dans un ordre aléatoire nos differentes clés: \n");
         for(String i : hm.keySet() )
         System.out.print(i+" "); //affiche les clés qui sont ici des String.
        
    }
}