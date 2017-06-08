
public interface SetupWriter {
    void CreateSetupFile();
    void UpdateSetupFile(String name, String address, String city, String phone, String email, String website);
    String [] getSetupInfo(int numOfLines);
    int LineNumber();
}
