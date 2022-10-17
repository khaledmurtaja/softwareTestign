package quiz;

import java.util.ArrayList;
import java.util.List;

public class CustomerNames implements InvoiceListener {
    String CustomerNames ="customer names:";
    List<Invoice> list=new ArrayList<>();


    @Override
    public void setData(Invoice invoice) {
        list.add(invoice);
        CustomerNames +=invoice.customerName+",";
        System.out.println(CustomerNames);

    }
}
