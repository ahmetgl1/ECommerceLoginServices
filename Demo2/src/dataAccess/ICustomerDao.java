package dataAccess;

import entities.concretes.Customer;

public interface ICustomerDao {
    void add(Customer customer);
    void delete(Customer customer);
}
