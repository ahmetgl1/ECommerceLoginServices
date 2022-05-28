package dataAccess;

import entities.concretes.Customer;

public class MySqlCustomerDao implements ICustomerDao{

    @Override
    public void add(Customer customer) {
        System.out.println("Müşteri Eklendi :" + customer.getId());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Müşteri Silindi :" + customer.getId());

    }
}
