/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.users;

import java.util.HashMap;

/**
 *
 * @author 2ndyrGroupC
 */
public class AccountList {
    private HashMap<String,String>accountList=new HashMap();

    public AccountList() {
    }

    public HashMap<String, String> getAccountList() {
        return accountList;
    }

    public void setAccountList(HashMap<String, String> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return accountList.toString();
    }
    
}
