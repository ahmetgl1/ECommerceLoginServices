package core;

import entities.concretes.Customer;

import java.util.regex.Pattern;

public class CustomerCheckManager implements ICustomerCheck{
    @Override
    public boolean validMail(Customer customer) {

        String regex="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";


        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        if(pattern.matcher(customer.getEposta()).find()){
     System.out.println("Doğru !");
            return true;

        }
        else{
            System.out.println("Geçersiz Email Adresidir");
            return false;
        }


    }

    @Override
    public boolean checkName(Customer customer) {
        if(customer.getName().length() >2 && customer.getSurName().length() >2){
            System.out.println("Check Name Doğru ");
            return true;
        }
        else{
            System.out.println("Karakter Sayısı 2 den daha az  olamaz !");
            return false;
        }

    }

    @Override
    public boolean checkPassword(Customer customer) {
        if(customer.getPassword().length() > 6){
            return true;
        }
        else{
            System.out.println("Şifre Alanı 6 dan küçük olamaz !!");
            return false;
        }

    }

    @Override
    public boolean checkUser(Customer customer) {
        return false;
    }
}
