
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.apache.commons.io.FilenameUtils;


public class SavedInspections implements SavedInspectionsDAO{
    private Path SavedFilePath = null;
    private File SavedFile = null;
    
    public SavedInspections(){
        SavedFilePath = Paths.get("Inspections\\");
        SavedFile = SavedFilePath.toFile();
    }
    
    public String [] setSavedInspections(int NumOfLines, String selection){
        String [] SavedInspections = new String[NumOfLines];
        Path toInspectionpath = Paths.get("Inspections\\" + selection);
        File toInspectFile = toInspectionpath.toFile();
        if (Files.exists(toInspectionpath))
            { try (BufferedReader in = 
                     new BufferedReader(
                     new FileReader(toInspectFile)))
            {
                int i = 0;
                String line = in.readLine();
                while(line != null)
                {
                     
                    SavedInspections[i] = line; 
                    line = in.readLine(); 
                    i++;
                }
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(new javax.swing.JFrame(), e);
            }
            }
        else
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), "The File does not Exist. setSavedInspections function.");
    return SavedInspections;
    }
    
    public int LineNumber(String selection){
        int NumOfLines=0;
        Path toInspectionpath = Paths.get("Inspections\\" + selection);
        File toInspectFile = toInspectionpath.toFile();
        if (Files.exists(toInspectionpath)){
            try(LineNumberReader  lnr = new LineNumberReader(new FileReader(toInspectFile))){
    
                lnr.skip(Long.MAX_VALUE);
                NumOfLines = (lnr.getLineNumber() + 1);
                lnr.close();
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(new javax.swing.JFrame(), e);
                
            }
    
    }
        else
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), "The File does not Exist.");
         return NumOfLines;
    }
  
    public void getSavedInspections(JList list, DefaultListModel saveList){  
        File[] files = new File("Inspections\\").listFiles(new FilenameFilter() { @Override public boolean accept(File dir, String name) { return name.endsWith(".txt"); } });
        for (File file : files) {
            if (file.isFile()) {
                String name = FilenameUtils.removeExtension(file.getName());
                saveList.addElement(name);
            }
            list.setModel(saveList);
        }
    }
}
