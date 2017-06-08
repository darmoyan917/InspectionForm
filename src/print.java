
import static java.awt.Color.WHITE;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;


public class print implements PrinterInterface, Printable {
    
    
    JFrame frameToPrint;
   
    public void PrintPage(JFrame frame){
        reportPrinter(frame);
        PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
             frame.setVisible(false);
         }
         frame.setVisible(false);
    }
    
    public int print(Graphics g, PageFormat pf, int page) throws
                                                        PrinterException {
 
       Dimension dim = frameToPrint.getSize();
        double cHeight = dim.getHeight();
        double cWidth = dim.getWidth();
        double pHeight = pf.getImageableHeight();
        double pWidth = pf.getImageableWidth();
      
        if (page >= 1) {
            return Printable.NO_SUCH_PAGE;
        }
        double xRatio = pWidth / cWidth;
        double yRatio = pHeight / cHeight;
        Graphics2D g3 = (Graphics2D)g;
        
        g3.translate(pf.getImageableX(), pf.getImageableY());
        g3.scale(xRatio, yRatio);
        frameToPrint.setBackground(WHITE);
        frameToPrint.print(g3);
        
       
        return PAGE_EXISTS;
    }
    
    public void reportPrinter(JFrame f) {
        frameToPrint = f;
       
    }
    
    
}
