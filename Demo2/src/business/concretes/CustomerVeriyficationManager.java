package business.concretes;

import business.abstracts.ICustomerVeriyficationServices;
import entities.concretes.Customer;

public class CustomerVeriyficationManager implements ICustomerVeriyficationServices {
    @Override
    public void verify(Customer customer) {
        System.out.println("Doğrulama Kodu Gönderildi !");
    }
}
