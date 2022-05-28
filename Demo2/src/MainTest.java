import business.concretes.CustomerManager;
import business.concretes.CustomerVeriyficationManager;
import core.CustomerCheckManager;
import dataAccess.MySqlCustomerDao;
import entities.concretes.Customer;

public class MainTest {
    public static void main(String[] args) {
        Customer ahmet = new Customer(2,"Ahmet Fatih","Güzeller","ahmetfatih.guzeller@pru.edu.tr","123456878");
        CustomerManager manager = new CustomerManager(new MySqlCustomerDao(),new CustomerCheckManager(),new CustomerVeriyficationManager());
        manager.register(ahmet);




    }
}
