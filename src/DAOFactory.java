



public class DAOFactory
{
    // this method maps the ProductDAO interface
    // to the appropriate data storage mechanism
    public static ModelDAO getModelDAO(String SelectedMake)
    {
        ModelDAO cDAO = new ModelSelection(SelectedMake);
        return cDAO;
    }
    public static SetupDAO getSetupDAO()
    {
        SetupDAO sDAO = new SetupShopInfo();
        return sDAO;
    }
    public static PrinterInterface getPrintInt()
    {
        PrinterInterface printInt = new print();
        return printInt;
    }
    public static SavedInspectionsDAO getInspectionsDAO()
    {
        SavedInspectionsDAO savedIns = new SavedInspections();
        return savedIns;
    }
    public static saveFileDAO getSaveFileDAO()
    {
        saveFileDAO saveFile = new saveFile();
        return saveFile;
    }
   
}