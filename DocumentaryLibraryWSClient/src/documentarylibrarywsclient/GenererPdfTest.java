/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentarylibrarywsclient;

import java.util.ArrayList;
import java.util.Scanner;
import org.url.documentlibrary.DocumentMap;
import org.url.documentlibrary.Exception_Exception;
import org.url.documentlibrary.Pdf;

/**
 *
 * @author benjamin
 */
public class GenererPdfTest {

    /**
     * Cette classe test la récupération d'un fichier pdf.
     * @param args the command line arguments
     * @throws Exception_Exception
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception_Exception, Exception {
        System.out.println("Fichier présent sur le serveur : ");
        //on affiche la liste des documents présent sur le serveur
        DocumentMap allFiles = WebServices.rechercheDocument(new ArrayList<String>(),"et");
            
        DocumentMap.RealMap resultat = allFiles.getRealMap();

        for (DocumentMap.RealMap.Entry e:resultat.getEntry()) {
            System.out.println("Index : "+e.getKey()+"; Titre : "+e.getValue());
        }
        
        System.out.println("Veuillez saisir l'index du fichier à récupérer :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        //on le force à saisir au moins un mot clés
        while(str.isEmpty()){
            System.out.println("Veuillez saisir un index :");
            sc = new Scanner(System.in);
            str = sc.nextLine();
        }
        
        try{
            Pdf lePdf = WebServices.generePDF(Integer.valueOf(str));
            Tools.byteToDocument(lePdf);
        }
         catch (Exception ex) {
            System.out.println("Une erreur est survenue lors de la récuperation du pdf.");
        }
        
    }
    
}
