/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.users;

import java.util.ArrayList;


/**
 *
 * @author 2ndyrGroupC
 */
public class AccountList {
    private ArrayList<Account>accountList=new ArrayList();

    public AccountList() {
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return accountList.toString();
    }
    
}
