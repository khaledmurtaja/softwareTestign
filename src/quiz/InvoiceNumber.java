package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InvoiceNumber implements InvoiceListener {
    List<Invoice> list=new ArrayList<>();
    double invoiceNumber;
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    @Override
    public void setData(Invoice invoice) throws IOException {
        list.add(invoice);
        for (int i=0; i<list.size(); i++){
            if(list.get(i).invoiceDate==invoice.invoiceDate){
                int x=Integer.parseInt(invoice.invoiceNumber);
                invoiceNumber +=x;
            }
        }
        File f=new File("c://Users//khaled//desktop//invoice//invoice.db");
        String[] myFiles=f.list();
        myFiles.notifyAll();;
        FileWriter fileWriter =new FileWriter(f);
        fileWriter.write(5);
        System.out.println("invoice discount="+invoiceNumber+", according to date on"+invoice.invoiceDate);
        invoiceNumber=0;


    }
}
