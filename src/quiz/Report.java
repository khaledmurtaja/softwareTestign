package quiz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Report {
    List<InvoiceListener> listeners;


    public Report() {
        this.listeners =new ArrayList<>();
    }
    public void addAListener(InvoiceListener listener) {
        if(!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }
    public void SendInvoice(Invoice invoice) throws IOException {
        for(InvoiceListener l: listeners)
            l.setData(invoice);
    }


}


