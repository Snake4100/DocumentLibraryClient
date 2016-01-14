/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentarylibrarywsclient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.url.documentlibrary.Pdf;

/**
 *  Cette classe contient les méthodes utiles notament pour convertire les fichiers en tabeau de bytes et inversement
 * 
 * @author Quentin NAUD, Benjamin NEILZ
 * @version 1.0
 */
public class Tools {
    static String repertoireXMLFiles = System.getProperty("user.dir")+"/xml-files/";
    static String repertoirePDFFiles = System.getProperty("user.dir")+"/pdf-files/";
    
    /**
     * Cette fonction récupère tous les fichiers xml
     * @return retourne une liste de fichier
     */
    public static File[] getXMLFiles(){
        //on récupére le dossier
        File folder = new File(Tools.repertoireXMLFiles);
        //on retourne tous les fichiers de ce dossier
        return folder.listFiles();
    }
        
    
    /**
     * Cette méthode permet convertir un fichier en tableau de byte.
     * 
     * @param chemin Chemin du fichier que l'on veut convertire
     * @return Un tableau de byte
     * @throws IOException 
     */
    public static byte[] documentToByte(String chemin) throws IOException
    {
        Path path = Paths.get(chemin);
        byte[] data = Files.readAllBytes(path);
        return data;
    }
    
    /**
     * Cette méthode converti un tableau de byte en fichier et l'enregistre. Cette méthode était utilisée pour le débug.
     * 
     * @param lePdf objet pdf que l'on veut enregistrer en fichier pdf
     * @throws Exception
     */
    public static void byteToDocument(Pdf lePdf) throws Exception {
        String fileName = repertoirePDFFiles+lePdf.getNom();
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(lePdf.getContenu());
        fos.close();
        
        //on ouvre le document
        java.awt.Desktop.getDesktop().open(new File(fileName));
    }
}
