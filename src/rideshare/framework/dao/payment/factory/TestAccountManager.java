package rideshare.framework.dao.payment.factory;


import java.time.LocalDate;

import rideshare.framework.dao.AccountManager;
import rideshare.framework.domain.payment.Account;

public class TestAccountManager {

    public static void main(String[] args){
    	//checkSelectAccountElement();
    	checkAddAccountElement();
    }
    public static void checkSelectAccountElement(){
        AccountManager accountManager = new AccountManager();
        Account acc = accountManager.getElement(2);
        Account acc2 = new Account();
       System.out.println(acc.toString());
       System.out.println(acc2.toString());
    }


    public static void checkAddAccountElement(){
        AccountManager accountManager = new AccountManager();
        Account acc2 = new Account();
        acc2.setAccountNumber(1213123);
        acc2.setCurrency("EUR");
        acc2.setStartDate(LocalDate.parse("2018-01-01"));
        acc2.setEndDate(LocalDate.parse("2019-11-01"));
        acc2.setInterestRate((float) 1.21);
        acc2.setType("credit");
        boolean result = accountManager.add(acc2);
        System.out.println(result);
    }


    public void checkDeleteAccountElement(){
        AccountManager accountManager = new AccountManager();
        Account acc2 = new Account();
        acc2.setId(3);
        boolean result = accountManager.delete(acc2);
        System.out.println(result);
    }

   
    public void checkUpdateAccountElement(){
        AccountManager accountManager = new AccountManager();
        Account acc2 = new Account();
        acc2.setAccountNumber(987456377);
        acc2.setCurrency("EUR");
        acc2.setStartDate(LocalDate.parse("2015-01-25"));
        acc2.setEndDate(LocalDate.parse("2019-11-30"));
        acc2.setInterestRate((float) 2.21);
        acc2.setType("credit");
        acc2.setId(3);
        boolean result = accountManager.update(acc2);
        System.out.println(result);
    }
}
