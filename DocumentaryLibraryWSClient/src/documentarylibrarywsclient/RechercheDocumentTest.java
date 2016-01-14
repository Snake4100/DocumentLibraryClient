/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentarylibrarywsclient;

import java.util.Scanner;
import org.url.documentlibrary.DocumentMap;
import org.url.documentlibrary.Pdf;

/**
 *  Cette classe test la recherche de document par mots clé via le web service.
 * 
 * @author Quentin NAUD, Benjamin NEILZ
 * @version 1.0
 */
public class RechercheDocumentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.util.List<java.lang.String> motsCles = new java.util.ArrayList<java.lang.String>();
        
        System.out.println("Veuillez saisir un mot clé :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //on le force à saisir au moins un mot clés
        while(str.isEmpty()){
            System.out.println("Veuillez saisir un mot clé :");
            sc = new Scanner(System.in);
            str = sc.nextLine();
        }
        
        //Temps qu'il saisi des mots clés
        while(!str.isEmpty()){
            motsCles.add(str);
            System.out.println("Autre mot clé, ou appuyer sur entrer :");
            sc = new Scanner(System.in);
            str = sc.nextLine();
        }
        
        //on lui demande maintenant s'il veut faire des "et" ou des "ou"
        String operation = "";
        while(!str.equals("et") && !str.equals("ou")){
            System.out.println("Saisi l'opération à effectuer sur les mots clés : \"et\" ou \"ou\" :");
            sc = new Scanner(System.in);
            str = sc.nextLine();
        }
        
        operation = str;
        
        //on fais la recherche via le web service
        DocumentMap resultatRecherche = WebServices.rechercheDocument(motsCles, operation);
        
        //on parcours ce résultat pour afficher les nom des fichiers trouvé
        DocumentMap.RealMap resultat = resultatRecherche.getRealMap();
        for (DocumentMap.RealMap.Entry e:resultat.getEntry()) {
            //on affiche le resultat trouvé
            System.out.println("Index : "+e.getKey()+"; Titre : "+e.getValue());

        }
        
    }
    
}
