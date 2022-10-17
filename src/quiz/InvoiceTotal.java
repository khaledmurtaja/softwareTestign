package quiz;

import java.util.ArrayList;
import java.util.List;

public class InvoiceTotal implements InvoiceListener {
    List<Invoice> list=new ArrayList<>();
    double InvoiceTotal;
    @Override
    public void setData(Invoice invoice) {
        list.add(invoice);
        for (int i=0; i<list.size(); i++){
            if(list.get(i).invoiceDate==invoice.invoiceDate){
                InvoiceTotal+=invoice.inVoiceTotal;
            }
        }
        System.out.println("invoice total="+InvoiceTotal+", according to date on"+invoice.invoiceDate);
        InvoiceTotal=0;

    }
}
