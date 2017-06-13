
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;


public interface saveFileDAO {
     String[] getComponenets(Container container, int arraySize, int i);
     int getComponentSize(Container container);
     int setComponentsToNewFile(JTextField yearText, JComboBox MakeComboBox, JComboBox ModelComboBox, JTextField vinText, JFileChooser SaveFileChooser, JFrame frame, String[] ReadField);
     void setComponentsToFile( String[] ReadField, JFileChooser SaveFileChooser);
}
