package quiz;

final public class Invoice {
    String invoiceNumber;
    double inVoiceTotal;
    double invoiceDiscount;
    String invoiceTime;
    String invoiceDate;
    String customerName;

    private Invoice(String invoiceNumber, double inVoiceTotal, double invoiceDiscount, String invoiceTime, String invoiceDate, String customerName) {
        this.invoiceNumber = invoiceNumber;
        this.inVoiceTotal = inVoiceTotal;
        this.invoiceDiscount = invoiceDiscount;
        this.invoiceTime = invoiceTime;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getInVoiceTotal() {
        return inVoiceTotal;
    }

    public void setInVoiceTotal(double inVoiceTotal) {
        this.inVoiceTotal = inVoiceTotal;
    }

    public double getInvoiceDiscount() {
        return invoiceDiscount;
    }

    public void setInvoiceDiscount(double invoiceDiscount) {
        this.invoiceDiscount = invoiceDiscount;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    static  class builder{
        String invoiceNumber;
        double inVoiceTotal;
        double invoiceDiscount;
        String invoiceTime;
        String invoiceDate;
        String customerName;

        public String getInvoiceNumber() {
            return invoiceNumber;
        }

        public void setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        public double getInVoiceTotal() {
            return inVoiceTotal;
        }

        public void setInVoiceTotal(double inVoiceTotal) {
            this.inVoiceTotal = inVoiceTotal;
        }

        public double getInvoiceDiscount() {
            return invoiceDiscount;
        }

        public void setInvoiceDiscount(double invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
        }

        public String getInvoiceTime() {
            return invoiceTime;
        }

        public void setInvoiceTime(String invoiceTime) {
            this.invoiceTime = invoiceTime;
        }

        public String getInvoiceDate() {
            return invoiceDate;
        }

        public void setInvoiceDate(String invoiceDate) {
            this.invoiceDate = invoiceDate;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public Invoice builder_invoice() {
            if(invoiceNumber==null){
                throw new NullPointerException("invoice number cannot be null");
            }
            if(inVoiceTotal==0){
                throw new NullPointerException("invoice total cannot be null");
            }
            if(invoiceDiscount==0){
                throw new NullPointerException("invoice discount cannot be null");
            }
            if (invoiceTime==null){
                throw new NullPointerException("invoice time cannot be null");
            }
            if (invoiceDate==null){
                throw new NullPointerException("invoice date cannot be null");
            }
            if(customerName==null){
                throw new NullPointerException("customer name total cannot be null");
            }
            Invoice invoice=new Invoice(invoiceNumber,inVoiceTotal,invoiceDiscount,invoiceTime,invoiceDate,customerName);
            return  invoice;



        }
    }
}
