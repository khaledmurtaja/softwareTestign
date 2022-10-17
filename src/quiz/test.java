package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
      File file =new File("c://Users//khaled//desktop//invoice//invoice.db"); // getting path of the local invoice db to add the new ones
      String x=null;
      x.toLowerCase();
        Invoice.builder invoice= new Invoice.builder();
        invoice.setInvoiceDate("27-4-2020");
        invoice.setInvoiceDiscount(4);
        invoice.setInvoiceNumber("1");
        invoice.setCustomerName("khaled");
        invoice.setInVoiceTotal(33);
        invoice.setInvoiceTime("10pm");
        Invoice in1=invoice.builder_invoice();
        //**
        Invoice.builder invoice2= new Invoice.builder();
        invoice.setInvoiceDate("27-2-2020");
        invoice.setInvoiceDiscount(2);
        invoice.setInvoiceNumber("5");
        invoice.setCustomerName("karim");
        invoice.setInVoiceTotal(32);
        invoice.setInvoiceTime("11pm");
        Invoice in2=invoice.builder_invoice();

        //**
        Invoice.builder invoice3= new Invoice.builder();
        invoice.setInvoiceDate("27-2-2020");
        invoice.setInvoiceDiscount(2);
        invoice.setInvoiceNumber("4");
        invoice.setCustomerName("ahmad");
        invoice.setInVoiceTotal(32);
        invoice.setInvoiceTime("1pm");
        Invoice in3=invoice.builder_invoice();

        //*
        Invoice.builder invoice4= new Invoice.builder();
        invoice.setInvoiceDate("28-2-2021");
        invoice.setInvoiceDiscount(2);
        invoice.setInvoiceNumber("3");
        invoice.setCustomerName("ali");
        invoice.setInVoiceTotal(32);
        invoice.setInvoiceTime("11pm");
        Invoice in4=invoice.builder_invoice();

        //*
        Invoice.builder invoice5= new Invoice.builder();
        invoice.setInvoiceDate("27-2-2020");
        invoice.setInvoiceDiscount(2);
        invoice.setInvoiceNumber("2");
        invoice.setCustomerName("mohannad");
        invoice.setInVoiceTotal(32);
        invoice.setInvoiceTime("11pm");
        Invoice in5=invoice.builder_invoice();


        //**
        Report s=new Report();
        InvoiceNumber invoiceNumber=new InvoiceNumber();
        InvoiceDiscount invoiceDiscount=new InvoiceDiscount();
        InvoiceTotal invoiceTotal=new InvoiceTotal();
        CustomerNames customerNames=new CustomerNames();
        // make subscribe to the observer
        s.addAListener(invoiceDiscount);
        s.addAListener(invoiceNumber);
        s.addAListener(invoiceTotal);
        s.addAListener(customerNames);
        // notify subscribers

      File f=new File("c://Users//khaled//desktop//invoice//invoice.db");
      String[] myFiles=f.list();
      myFiles.notifyAll();;
      FileWriter fileWriter =new FileWriter(f);
      fileWriter.write(in3.invoiceTime);
        s.SendInvoice(in1);
        System.out.println("******");
        s.SendInvoice(in2);
        System.out.println("******");
        s.SendInvoice(in3);
        System.out.println("******");
        s.SendInvoice(in4);
        System.out.println("******");
        s.SendInvoice(in5);
        File db=new File("c://Users//khaled//desktop//invoice//invoice.db");




    }
}
