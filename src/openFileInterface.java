
import java.awt.Container;
import java.io.File;


public interface openFileInterface {
    String[] openFile(File openfile, int NumOfLines);
    int LineNumber(File openfile);
    void setComponenets(Container container, String[] ReadField, int i);
}
