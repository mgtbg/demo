package com.example.demo.Controllers;

import com.example.demo.models.Account;
import com.example.demo.models.Transanction;

public class TransanctionController {
    Account account1 = new Account();
    Account account2 = new Account();

    Transanction transanction1 = new Transanction();

    static void AC1(Transanction transanction1,Account account1, Account account2) {

        if (transanction1.getSourceAccountId()!=0 && transanction1.getTargetAccountId() !=0){
            account1.setId()=transanction1.getSourceAccountId();
            account2.setId()=transanction1.getTargetAccountId();
            if (account1.getBalance()>account2.getBalance()){
                int x = account1.getBalance();
                x=x-transanction1.getAmount();


            }
        }

    }


    static void AC2(Transanction transanction1,Account account1, Account account2){


        if (transanction1.getSourceAccountId()!=0 && transanction1.getTargetAccountId() !=0){

            account1.setId()=transanction1.getSourceAccountId();
            account2.setId()=transanction1.getTargetAccountId();
            if (account1.getBalance()<account2.getBalance()){

                System.out.println("Error");

            }


        }


    }


    static void AC3(Transanction transanction1,Account account1, Account account2){


        if (transanction1.getSourceAccountId()!=0 && transanction1.getTargetAccountId() !=0){

            account1.setId()=transanction1.getSourceAccountId();
            account2.setId()=transanction1.getTargetAccountId();
            if (account1.getId() = account2.getId()){

                System.out.println("Error");

            }


        }


    }


    static void AC3(Transanction transanction1,Account account1, Account account2){


        if (transanction1.getSourceAccountId()!=0 && transanction1.getTargetAccountId() !=0){

            account1.setId()=transanction1.getSourceAccountId();
            account2.setId()=transanction1.getTargetAccountId();

                System.out.println("Error");



        }


    }


    static void AC3(Transanction transanction1,Account account1, Account account2){


        if (transanction1.getSourceAccountId()=0 || transanction1.getTargetAccountId()=0){

            account1.setId()=transanction1.getSourceAccountId();
            account2.setId()=transanction1.getTargetAccountId();
            if (account1.getId() = account2.getId()){

                System.out.println("Error");

            }


        }


    }




    }




}
