package fitnessapp;

import java.io.*;
import javax.swing.*;

/**
 * A class to handle saving and loading of objects from files
 * You will have to downcast the object that is returned
 * @author B1601563
 */
public class FileHandling {
    // methods to read the object from the file
    /**
     * A method that returns an object from a file
     * @param parent JFrame that calls this method
     * @return Object
     */
    public static Object readFromFile(javax.swing.JFrame parent) {
        // get the file using the openFileChooser() method
        File file = openFileChooser(parent);
        Object theObject = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            theObject = ois.readObject();
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            return theObject;
        }
    }
    
    /**
     * A method to select a file using filechooser
     * @param parent the JFrame that is the parent class of this dialog
     * @return File
     */
    private static File openFileChooser(javax.swing.JFrame parent) {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(parent);          // show the Open-File Dialog
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            return file;                                    // return the file that was selected
        }
        return null;
    }
    
    // methods to save the object to the file
    /**
     * A method to save an Object into a File
     * @param parent the JFrame that is the parent
     * @param theObject to be saved
     * @return String with file name
     */
    public static String saveToFile(javax.swing.JFrame parent, Object theObject) {
        JFileChooser fc = new JFileChooser();
        File file = null;
        int returnVal = fc.showSaveDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            saveObject(file, theObject);        // call the private method
            return file.getName();
        } else {
            return null;
        }
    }
    
    /**
     * A method to save the object into the selected file
     * @param file to save to
     * @param theObject to be saved
     */
    private static void saveObject(File file, Object theObject){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(theObject);
            oos.flush();
            oos.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            if (fos != null)
                try { fos.close(); } 
                catch (IOException ioe) { System.out.println(ioe.getMessage()); }
        }
    }
}
