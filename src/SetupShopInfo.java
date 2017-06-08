
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class SetupShopInfo implements SetupDAO {
    
    private Path SetupFilePath = null;
    private File SetupFile = null;
    
    public  SetupShopInfo(){
          SetupFilePath = Paths.get("setup\\shopinfo.txt");
          SetupFile = SetupFilePath.toFile();
          CreateSetupFile();
    }
    @Override
    public void CreateSetupFile()
    {        
        
        if (Files.notExists(SetupFilePath)){
	    try (PrintWriter out = new PrintWriter(
                               new BufferedWriter(
                               new FileWriter(SetupFile))))
        {

                out.println("Your Shop Name" );
                out.println("Your Shop Address" );
                out.println("Your Shop City" );
                out.println("Your Shop Phone");
                out.println("Your Shop Email");
                out.println("Your Shop Website");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), e);
           
        }
        }
}
    public void UpdateSetupFile(String name, String address, String city, String phone, String email, String website){
        if (Files.exists(SetupFilePath)){
        try (PrintWriter out = new PrintWriter(
                               new BufferedWriter(
                               new FileWriter(SetupFile))))
        {

                out.println(name);
                out.println(address);
                out.println(city);
                out.println(phone);
                out.println(email);
                out.println(website);
                JOptionPane.showMessageDialog(new javax.swing.JWindow(), "Shop info has been set up.");
                
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), e);
           
        }
    }
    }
    
    public String [] getSetupInfo(int NumOfLines){
        String[] ShopInfo = new String[NumOfLines];        
        
        if (Files.exists(SetupFilePath))  // prevent the FileNotFoundException
        {
            try (BufferedReader in = 
                     new BufferedReader(
                     new FileReader(SetupFile)))
            {
                int i = 0;
                String line = in.readLine();
                while(line != null)
                {
                     
                    ShopInfo[i] = line; 
                    line = in.readLine(); 
                    i++;
                }
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(new javax.swing.JFrame(), e);
                return null;
            }
        }
        else
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), "The File does not Exist.");
        return ShopInfo;
    }
    public int LineNumber(){
        int NumOfLines=0;
        if (Files.exists(SetupFilePath)){
            try(LineNumberReader  lnr = new LineNumberReader(new FileReader(SetupFile))){
    
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
            JOptionPane.showMessageDialog(new javax.swing.JWindow(), "The File does not Exist. Line # function.");
         return NumOfLines;
    }
}