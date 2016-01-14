/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentarylibrarywsclient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.url.documentlibrary.DocumentMap;
import org.url.documentlibrary.Exception_Exception;
import org.url.documentlibrary.Pdf;

/**
 *  Cette classe contient les méthodes permettant d'accéder aux web services
 * 
 * @author Quentin NAUD, Benjamin NEILZ
 * @version 1.0
 */
public class WebServices {
    
    
    /**
     * Cette méthode permet d'utiliser la méthode depotDocument du web service.
     * 
     * @param nom nom du fichier que l'on depose
     * @param contenu contenu en tableau de byte du fichier
     * @return Index du fichier
     * @throws Exception_Exception
     */
    public static int depotDocument(java.lang.String nom, byte[] contenu) throws Exception_Exception {
        org.url.documentlibrary.DocumentLibraryWS_Service service = new org.url.documentlibrary.DocumentLibraryWS_Service();
        org.url.documentlibrary.DocumentLibraryWS port = service.getDocumentLibraryWSPort();
        return port.depotDocument(nom, contenu);
    }
    
    /**
     * Cette méthode permet d'utiliser la méthode rechercheDocument du web service.
     * 
     * @param motsCles List de string des mots clés recherchés
     * @param condition Un string égale à "et" ou "ou" 
     * @return Résultat de l'appel du web service
     */
    public static DocumentMap rechercheDocument(java.util.List<java.lang.String> motsCles, java.lang.String condition) {
        org.url.documentlibrary.DocumentLibraryWS_Service service = new org.url.documentlibrary.DocumentLibraryWS_Service();
        org.url.documentlibrary.DocumentLibraryWS port = service.getDocumentLibraryWSPort();
        return port.rechercheDocument(motsCles, condition);
    }
    
    /**
     * Cette méthode permet de récupérer le pdf de l'index du document passé en paramètre.
     * 
     * @param index Index du document que l'on souhaite recuperer
     * @return Résultat de l'appel du web service
     * @throws org.url.documentlibrary.Exception_Exception
     */
    public static Pdf generePDF(int index) throws Exception_Exception {
        org.url.documentlibrary.DocumentLibraryWS_Service service = new org.url.documentlibrary.DocumentLibraryWS_Service();
        org.url.documentlibrary.DocumentLibraryWS port = service.getDocumentLibraryWSPort();
        return port.generePDF(index);
    }
}
