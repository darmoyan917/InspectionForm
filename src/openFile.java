
import java.awt.Component;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class openFile implements openFileInterface {
    
    
    public String[] openFile(File openfile, int NumOfLines){
        String[] fileReading = new String[NumOfLines];        
        Path openFilePath = Paths.get(openfile.getAbsolutePath());
        
            if (Files.exists(openFilePath))  // prevent the FileNotFoundException
            {
                try (BufferedReader in = 
                     new BufferedReader(
                     new FileReader(openfile)))
                {
                    int i = 0;
                    String line = in.readLine();
                    while(line != null)
                    {
                     
                        fileReading[i] = line; 
                        line = in.readLine(); 
                        i++;
                    }
                }
                catch(IOException e)
                {
                    JOptionPane.showMessageDialog(new javax.swing.JFrame(), e);
               
                }
            }
            else
                JOptionPane.showMessageDialog(new javax.swing.JWindow(), "The File does not Exist.");
        return fileReading;      
        }
    public int LineNumber(File openfile){
        Path openFilePath = Paths.get(openfile.getAbsolutePath());
        int NumOfLines=0;
        if (Files.exists(openFilePath)){
            try(LineNumberReader  lnr = new LineNumberReader(new FileReader(openfile))){
    
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
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), "The File does not Exist. Line # function for open file.");
         return NumOfLines;
    }
    
    
        int j = 0;
        public void setComponenets(Container container, String[] ReadField, int i){
        
        for (Component c : container.getComponents()) {
            
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setText(ReadField[i]);
                i++;
                j = i;
            } else if (c instanceof JComboBox){
               
                ((JComboBox) c).setSelectedItem(ReadField[i]);
                i++;
                j = i;
                } else if (c instanceof Container) {
                   
                setComponenets((Container) c, ReadField, j);
            }
            
        }
        
    }
    
}
