
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;


public interface saveFileDAO {
     String[] getComponenets(Container container, int arraySize);
     int getComponentSize(Container container);
     void setComponentsToNewFile(JTextField yearText, JComboBox MakeComboBox, JComboBox ModelComboBox, JTextField vinText, JFileChooser SaveFileChooser, JFrame frame, String[] ReadField);
}
