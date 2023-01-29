import java.util.TreeMap;

import java.util.Map;


/**
 * 
 * @author oem
 * @since 28/01/2023
 * 
 * @apiNote Cette collection se comporte comme HashMap, à la difference que celle ci est tres ordonné,
 *          donc naturellement plus lente
 * 
 *          PAS DOUBLONS, PAS THREAD-SAFE, ACCÈS DIRECT,ORDONNÉE,
 *          N'ACCEPTE PAS NULL(Sauf pour les valeurs null de clé non nulle)
 */
public class Test{
    public static void main(String[]args){

        TreeMap<Integer,String> tm=new  TreeMap<Integer,String>();

        tm.put(12,"Komo"); // constitue ce qu'on appelle egalement " Une entrée "
        tm.put(1,"Ali");
        tm.put(9,"Paulin");
        tm.put(28,"Rika");
        tm.put(4,"Kiluanji");

        //Pour recupérer simplement une valeur en fonction d'une clé :

        System.out.println("\nVoici un element de notre collection: ");
        System.out.println("\n"+tm.get(1)); // on recupere -->Ali

        //Les elements de cette collection sont ordonnés

        System.out.println("\nVoici nos differentes clés ordonnées : \n");
        for(Integer k : tm.keySet()){
            System.out.print(k+" ");
        }

        /**
         * 
         * l'unicité de chaque élement est tres importante
         * 
         * Dans cette collection, on peut afficher l'ensemble des couples clés/Valeurs(Les entrées)
         * Pour afficher cet ensemble, on utilise la methode " .entrySet(); "
         * Mais ceci ce fais dans une bouble.
         * 
         * Pour ce faire on fais appel à une autre collection " Map " selon la structure: 
         * 
         * -----> Map.Entry< TypePrimitif1,TypePrimitif2 > 
         * pour notre exemple on aura: " Map.Entry<Integer,String> "
         * 
         * Biensur, on importe la collection Map, pour plus de sureté
         * 
         * Pour afficher " clés: variable.getKey() "
         *               " Valeurs: variable.getValue() "
         *   
         * 
         */

         System.out.println("\n\nCi dessous notre ensemble complet clés/valeurs : \n");
         for(Map.Entry<Integer,String> ent :tm.entrySet()){
            System.out.println("\nClés: "+ent.getKey()+"\nValeurs: "+ent.getValue());
         }

    }
}