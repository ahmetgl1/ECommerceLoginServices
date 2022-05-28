package core;

import entities.concretes.Customer;

public interface ICustomerCheck {

    boolean validMail(Customer customer);
    boolean checkName(Customer customer);
    boolean checkPassword(Customer customer);
    boolean checkUser(Customer customer);


}
