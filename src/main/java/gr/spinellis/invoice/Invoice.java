package gr.spinellis.invoice;

import gr.spinellis.product.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
    public double total;
    public List <InvoiceItem> items = new ArrayList<InvoiceItem>();
    public Customer customer;
    public Date invoiceDate;
    
    public void addItem(Product p, int quantity) {};
}
