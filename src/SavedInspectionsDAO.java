
import javax.swing.DefaultListModel;
import javax.swing.JList;


public interface SavedInspectionsDAO {
    void getSavedInspections(JList list, DefaultListModel saveList);
    int LineNumber(String selection);
    String [] setSavedInspections(int numofLines, String selection);
}
