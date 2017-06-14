
import javax.swing.DefaultListModel;
import javax.swing.JList;


public interface SavedInspectionsInterface {
    void getSavedInspections(JList list, DefaultListModel saveList);
    int GetLineNumber(String selection);
    String [] setSavedInspections(int numofLines, String selection);
}
