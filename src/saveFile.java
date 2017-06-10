
import java.awt.Component;
import java.awt.Container;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;


public class saveFile implements saveFileDAO {
    File selFile = null;
    int i =0;
    
    public saveFile(){
        
    }
    public int getComponentSize(Container container){
        int arraySize =0;
        for (Component d : container.getComponents()){
            if (d instanceof JTextField || d instanceof JComboBox){
                arraySize++;
            }
            else if (d instanceof Container) {
                getComponentSize((Container) d);
            }
        }
        return arraySize;
    }
    
    public String[] getComponenets(Container container, int arraySize){
        
        i = 0;
        String [] ReadField = new String [arraySize];
        for (Component c : container.getComponents()) {
            
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                ReadField[i] = f.getText();
                System.out.println(ReadField[i]);
                
                i++;
            } else if (c instanceof JComboBox){
                if(((JComboBox) c).getSelectedIndex()>=0){
                ReadField[i] = ((JComboBox) c).getSelectedItem().toString();
                System.out.println(ReadField[i]);
                i++;
                }
                else {
                    JOptionPane.showMessageDialog(new javax.swing.JWindow(), "Please select Color, Make, and Model before saving.");
                    break;
                     }
                } else if (c instanceof Container) {
                getComponenets((Container) c, arraySize );
            }
            
        }
        return ReadField;
        
    }
    public void setComponentsToNewFile(JTextField yearText, JComboBox MakeComboBox, JComboBox ModelComboBox, JTextField vinText, JFileChooser SaveFileChooser, JFrame frame, String[] ReadField){
         try {
            selFile = new File(yearText.getText() + " "+ MakeComboBox.getSelectedItem() + " " + ModelComboBox.getSelectedItem() + " " + vinText.getText(13,4).toUpperCase() + ".txt");
        } catch (BadLocationException ex) {
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), "Please enter a valid 17 digit VIN number.");
            return;
        }
    SaveFileChooser.setSelectedFile(selFile);
    int returnval = SaveFileChooser.showSaveDialog(frame);
    if (returnval == JFileChooser.APPROVE_OPTION) {
  
      File file = SaveFileChooser.getSelectedFile();
      try{
        if(!file.exists()){
        file.createNewFile();
        }
    try (PrintWriter out = new PrintWriter(
                               new BufferedWriter(
                               new FileWriter(file)))){
            for (String ReadField1 : ReadField) {
                out.println(ReadField1);
            }
      } catch (IOException ex) {
            Logger.getLogger(InspectionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }catch(IOException x){
          
      }
    }
    }
    
    public void setComponentsToFile(){
        
    }
}
