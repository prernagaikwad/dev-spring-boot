package com.prernagaikwad.springboot.AOPdemo.DAO;

import com.prernagaikwad.springboot.AOPdemo.Account;

public interface AccountDAO
{


    void addAccount(Account theAccount, boolean vipFlag);


    boolean doWork();
}
