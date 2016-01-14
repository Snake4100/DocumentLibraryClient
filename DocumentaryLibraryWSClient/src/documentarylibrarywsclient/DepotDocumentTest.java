/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentarylibrarywsclient;

import java.io.File;
import java.io.IOException;
import org.url.documentlibrary.Exception_Exception;

/**
 *  Cette classe test le dépot de document via le web service.
 *  Un des fichiers ajouté est volontairement mal formé pour montrer le retour d'erreur.
 * @author Quentin NAUD, Benjamin NEILZ
 * @version 1.0
 */
public class DepotDocumentTest {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws org.url.documentlibrary.Exception_Exception
     */
    public static void main(String[] args) throws IOException, Exception_Exception{
        //On récupére tous les fichiers du répertoire contenant les fihciers xml
        File[] xmlFiles = Tools.getXMLFiles();
        //Pour chaque fichiers
        for (int i = 0; i < xmlFiles.length; i++) {
            //si c'est bien un fichier xml
            if (xmlFiles[i].isFile() && xmlFiles[i].getName().contains(".xml")) {
                
                System.out.println("On essai d'ajouter " + xmlFiles[i].getName());
                try{
                    //on récupére le contenu du fichier en tableau de byte
                    byte[] fileContent = Tools.documentToByte(Tools.repertoireXMLFiles+xmlFiles[i].getName());
                    //on l'envoi
                    int resultat = WebServices.depotDocument(xmlFiles[i].getName(), fileContent);
                    
                    //si on nous retourne -1 c'est que le serveur à rencontré une erreure et que le fichier n'a pas été ajouté.
                    if(resultat == -1){
                        System.out.println("L'envoi n'a pas fonctionné.");
                    }
                    //sinon, c'est que ça a fonctionné
                    else{
                        System.out.println(resultat+" : Succés de l'envoi"); 
                    }
 
                }
                catch (IOException ex) {
                    System.out.println("Impossible de récupérer le contenu du fichier : " + ex);
                }  
                catch (Exception ex) {
                    System.out.println("Impossible d'envoyer le fichier : " + ex);
                }
            } 
        }
    }
    
}
