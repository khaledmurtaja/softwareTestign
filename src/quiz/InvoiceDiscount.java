package quiz;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDiscount implements InvoiceListener {
    List<Invoice> list=new ArrayList<>();
    double invoiceDiscount;


    @Override
    public void setData(Invoice invoice) {
        list.add(invoice);
        for (int i=0; i<list.size(); i++){
            if(list.get(i).invoiceDate==invoice.invoiceDate){
                 invoiceDiscount += invoice.invoiceDiscount;
            }
        }
        System.out.println("invoice discount="+invoiceDiscount+", according to date on"+invoice.invoiceDate);
        invoiceDiscount=0;

    }
}
