package business.concretes;

import business.abstracts.ICustomerServices;
import business.abstracts.ICustomerVeriyficationServices;
import core.ICustomerCheck;
import dataAccess.ICustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements ICustomerServices {


    private ICustomerDao iCustomerDao;
    private ICustomerCheck iCustomerCheck;
    private ICustomerVeriyficationServices iCustomerVeriyficationServices;

    public CustomerManager(ICustomerDao iCustomerDao,ICustomerCheck iCustomerCheck,ICustomerVeriyficationServices iCustomerVeriyficationServices) {
        this.iCustomerDao = iCustomerDao;
        this.iCustomerCheck = iCustomerCheck;
        this.iCustomerVeriyficationServices = iCustomerVeriyficationServices;
    }

    @Override

    public void register(Customer customer) {

        if(iCustomerCheck.validMail(customer) ==true && iCustomerCheck.checkName(customer) == true && iCustomerCheck.checkPassword(customer)){
            System.out.println("Sisteme Giriş Yapıldı !");


               iCustomerDao.add(customer);
               iCustomerVeriyficationServices.verify(customer);

            }

        else{
            System.out.println("Sisteme  Kayıt Yapılamadı Maalesef Başarısız ! ");
        }

            }

    @Override
    public void signUp(Customer customer) {

    }


}










 //System.out.println("Kayıt Gerçekleştirildi !");
  //       iCustomerDao.add(customer);
        //  if(customer.getEposta().isEmpty() || customer.getEposta() == null){
        //     System.out.println("Email Bulunamadı !");
        // }
        //  else{

        //   String email = customer.getEposta().toString();
        // Pattern pattern  = Pattern.compile("@");
        //Matcher matcher  = pattern.matcher(email);
        // iCustomerDao.add(customer);







